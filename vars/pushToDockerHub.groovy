def call(){
  withCredentials([usernamePassword(credentialsId:"docker-hub-cred",passwordVariable:"dockerHubPass",usernameVariable:"dockerHubUser")]){
  sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPass}"
  sh "docker image tag notes-app:latest ${env.dockerHubUser}/notes-app:latest"
  sh "docker push ${env.dockerHubUser}/notes-app:latest"
  }
  echo "pushing to dockerhub"
}
