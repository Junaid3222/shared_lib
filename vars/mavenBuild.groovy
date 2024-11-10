def call() {
    def isWindows = System.getProperty('os.name').toLowerCase().contains('win')

    if (isWindows) {
        bat "mvn clean package" // Use 'bat' for Windows
    } else {
        sh "mvn clean package" // Use 'sh' for Linux/Unix
    }
}
