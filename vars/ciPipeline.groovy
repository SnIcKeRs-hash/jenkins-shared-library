def call(Map config = [:]) {
    // This is scripted Jenkins logic, which is more robust for libraries
    node {
        stage('Simulation') {
            echo "--- SUCCESS: The library is officially working! ---"
            sh "echo 'Cloning from ${config.repo ?: 'default repo'}'"
        }
    }
}
