def call() {
    dependencyCheck additionalArguments: '--scan ./ --format XML', odcInstallation: 'DependencyCheck'
}
