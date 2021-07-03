pipeline {
  agent any
  stages {
    stage('sample') {
      steps {
        addShortText background: 'yellow', color: 'black', borderColor: 'yellow', text: "INPUT = ${INPUT}"
        addInfoBadge id: '', text: 'Good'
      }
    }
  }
  post {
    always {
      cleanWs()
    }
  }
}
