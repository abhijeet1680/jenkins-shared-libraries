def call(String Project, String ImageTag, String dockerhubuser) {
    withCredentials([usernamePassword(credentialsId: 'dockerHubcred', passwordVariable: 'dockerHubPass', usernameVariable: 'dockerHubUser')]) {
        sh "echo ${dockerHubPass} | docker login -u ${dockerhubuser} --password-stdin"
        sh "docker tag ${Project}:${ImageTag} ${dockerhubuser}/${Project}:${ImageTag}"
        sh "docker push ${dockerhubuser}/${Project}:${ImageTag}"
    }
}
