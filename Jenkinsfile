#!groovy

@Library('MicroserviceBuilder') _
microserviceBuilderPipeline {
  image = 'demo'
  test = 'false'
  mvnCommands = '-Dmaven.test.skip=true package'
}
