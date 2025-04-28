def call(composeLocation){
  echo "this is deploying"
  sh "sudo apt-get install docker-compose-v2"
  sh "docker compose -f ${composeLocation} up -d "
}
