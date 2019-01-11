job("JenkinsJobDSL-1") {
	description("Jenkins Job DSL")
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
		shell("chmod 755 main.py")
		shell("./main.py")
	}
}
