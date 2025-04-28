def call(gitUrl,branch,cmd){
  git url:"${gitUrl}", branch:"${branch}"
  echo "This is new cloning the code"
  sh "${cmd}"
}
