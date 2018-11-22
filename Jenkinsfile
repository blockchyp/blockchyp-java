#!groovy
@Library('blockchyp-pipelines') _

pipeline {
  agent {
    docker { image 'maven:3.5-jdk-8-alpine' }
  }

  stages {
    stage('Start') {
      steps {
        notifySlack 'Started'
      }
    }
    stage('Build') {
      steps {
        sh 'mvn clean package'
      }
    }
    stage('SonarQube') {
      steps {
        withSonarQubeEnv('SonarQubeDev') {
          sh 'mvn org.sonarsource.scanner.maven:sonar-maven-plugin:3.2:sonar'
        }
      }
    }
  }

  post {
    always {
      junit allowEmptyResults: true, testResults: 'target/surefire-reports/*.xml'
      notifySlack()
    }
  }
}
