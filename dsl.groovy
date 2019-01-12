job("JenkinsJobDSL-1") {
	description("Jenkins Job DSL 1")
	keepDependencies(false)
	scm {
		git {
			remote {
				github("beerkeeper/python-ip-script", "https")
			}
			branch("*/master")
		}
	}
	disabled(false)
	concurrentBuild(false)
	steps {
		shell("python main.py")
	}
}
