node {
	// properties([
    //     pipelineTriggers([
    //         [$class: 'GenericTrigger',
    //             genericVariables: [
    //                 [expressionType: 'JSONPath', key: 'reference', value: '$.ref'],
    //                 [expressionType: 'JSONPath', key: 'before', value: '$.before'],
    //                 [expressionType: 'JSONPath', key: 'after', value: '$.after'],
    //                 [expressionType: 'JSONPath', key: 'repository', value: '$.repository.full_name']
    //             ],
    //             genericRequestVariables: [
    //                 [key: 'requestWithNumber', regexpFilter: '[^0-9]'],
    //                 [key: 'requestWithString', regexpFilter: '']
    //             ],
    //             genericHeaderVariables: [
    //                 [key: 'headerWithNumber', regexpFilter: '[^0-9]'],
    //                 [key: 'headerWithString', regexpFilter: '']
    //             ],
    //             regexpFilterText: '$repository/$reference',
    //             regexpFilterExpression: 'k8s-lab/gs-spring-boot-docker/refs/heads/master'
    //         ]
    //     ])
    // ])

    stage('Checkout') {
        checkout scm
    }

    // stage('Test') {
    //     sh './gradlew test || true'
    // }

    stage('Build') {
        try {
            sh './gradlew build -x test'
        } catch(e) {
            mail subject: "Jenkins Job '${env.JOB_NAME}' (${env.BUILD_NUMBER}) failed with ${e.message}",
                to: 'cnj-play@kt.com',
                body: "Please go to $env.BUILD_URL."
        }
    }

    stage('Archive') {
        parallel (
            "Archive Artifacts" : {
                archiveArtifacts artifacts: '**/build/libs/*.jar', fingerprint: true
            },
            "Docker Image Push" : {
                sh './gradlew dockerPush'
            }
        )
    }

    stage('Deploy') {
        sh 'kubectl apply --namespace=development -f deployment.yaml'
    }
}