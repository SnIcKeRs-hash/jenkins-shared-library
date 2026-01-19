def call(Map config = [:]) {
    // This echo MUST appear in logs if the library is working
    echo "--- LIBRARY LOG: ciPipeline has been triggered ---"

    pipeline {
        agent any
        stages {
            stage('Simulation') {
                steps {
                    echo 'Running Simulation...'
                }
            }
        }
    }
}
