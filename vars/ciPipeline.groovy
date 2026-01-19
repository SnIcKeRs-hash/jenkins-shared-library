def call(Map config = [:]) {
    // This echo is outside any blocks to ensure it prints to console immediately
    echo "--- EXECUTING SHARED LIBRARY: ciPipeline ---"
    
    node {
        stage('Simulation') {
            echo "Successfully running on a Jenkins node!"
            sh "echo 'Hello from the Shared Library simulation stage'"
        }
    }
}
