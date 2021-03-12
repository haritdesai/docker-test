.PHONY: build

workspace := $(PWD)

test:
	@docker run --rm -v $(workspace):/workspace -w /workspace openjdk:8 ./gradlew test --no-daemon