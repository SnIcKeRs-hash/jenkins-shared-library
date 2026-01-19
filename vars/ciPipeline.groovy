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
                    sh 'echo "SIMULATION: Running tests..."'
                }
            }
            stage('Deploy') {
                steps {
                    // FIX: Ensure the outer quotes are double (") so ${} works
                    sh "echo 'Successfully deployed'"
                }
            }
        }
    }
}
