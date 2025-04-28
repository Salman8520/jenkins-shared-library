def call(){
  echo "this is deploying"
  sh "sudo apt-get install docker-compose-v2"
  sh "docker compose -f django-todo-cicd/docker-compose.yml up -d "
}
