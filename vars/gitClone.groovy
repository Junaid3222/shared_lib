def call(repo) {
   stage('build') {
      steps {
         git url: 'https://github.com/Junaid3222/mvn-web-app.git'
      }
   }
}
