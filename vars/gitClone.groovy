def call(repo) {
   stage('clone') {
      steps {
         git url: 'https://github.com/Junaid3222/mvn-web-app.git'
      }
   }
}
