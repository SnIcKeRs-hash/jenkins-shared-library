def call(Map config = [:]) {
    pipeline {
        agent any 
        stages {
            stage('Checkout') {
                steps {
                    sh "echo 'SIMULATION: Cloning repository...'"
                }
            }
            stage('Build') {
                steps {
                    sh "echo 'SIMULATION: Building project...'"
                }
            }
            stage('Test') {
                steps {
                    sh "echo 'SIMULATION: Running tests...'"
                }
            }
            stage('Deploy') {
                steps {
                    sh "echo 'Successfully deployed'"
                }
            }
        }
    }
}
