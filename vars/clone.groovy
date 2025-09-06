def call(String url, String branch){
  echo "This is Django Code"
  git url: "$(url), branch: "$(branch)"
  echo "Code cloned successfully"
}
