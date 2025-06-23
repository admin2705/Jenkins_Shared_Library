def call(String imagename, String imagetag, String dockerhubuser){
  withCredentials([usernamePassword(credentialsId: 'dockercreds' passwordVariable: 'dockerhubpass' usernameVariable: 'DockerHubUser')]) {
    sh "docker login -u ${DockerHubUer} -p ${dockerhubpass}"
  }
  sh "docker push ${dockerhubuser}/${imagename}:${imagetag}"
}
