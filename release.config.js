var publishCmd = `
./gradlew assemble --parallel || exit 1
git tag -a -f \${nextRelease.version} \${nextRelease.version} -F CHANGELOG.md || exit 2
git push --force origin \${nextRelease.version} || exit 3
`
var config = require('semantic-release-preconfigured-conventional-commits');
config.plugins.push(
    ["@semantic-release/exec", {
        "publishCmd": publishCmd,
    }],
    ["@semantic-release/github", {
        "assets": [
            { "path": "build/libs/*.jar" },
            { "path": "modul1/build/libs/*.jar"},
            { "path": "modul2/build/libs/*.jar"}
        ]
    }],
    "@semantic-release/git",
)
// a fix 3
config.branches = ['main']

module.exports = config