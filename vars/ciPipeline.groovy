def call(Map config = [:]) {
    pipeline {
        agent any 

        stages {
            stage('Checkout') {
                steps {
                    // Simulated checkout
                    sh "echo 'SIMULATION: Cloning repository from ${config.repo ?: 'unknown-url'}...'"
                    sh "echo 'SIMULATION: Switching to branch ${config.branch ?: 'main'}...'"
                    sh "sleep 2" // Adds a bit of realism to the simulation
                }
            }
            stage('Build') {
                steps {
                    sh 'echo "SIMULATION: Compiling source code..."'
                    sh 'echo "SIMULATION: Creating build artifacts..."'
                }
            }
            stage('Test') {
                steps {
                    sh 'echo "SIMULATION: Running Unit Tests..."'
                    sh 'echo "SIMULATION: Running Integration Tests..."'
                }
            }
            stage('Deploy') {
                steps {
                    sh 'echo "SIMULATION: Pushing image to Minikube registry..."'
                    sh 'echo "SIMULATION: Applying Kubernetes manifests..."'
                    sh 'echo "Successfully deployed version ${config.version ?: '1.0.0'}"'
                }
            }
        }
    }
}