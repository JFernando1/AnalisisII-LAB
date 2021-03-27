# Build
# "make all" for example
# Publish on github
echo "Publishing on Github..."
token="fcb1331cbd2e0f696408376e423fb7fd42681a61"
#tag=$(git describe --tags)

#name=$(echo "$message" | head -n1)

# Create a release
#release=$(curl -XPOST --data "{\"tag_name\": \"$tag\", \"target_commitish\": \"master\", \"name\": \"$name\", \"draft\": false, #\"prerelease\": false}" 
#https://${USERNAME}:${pass}@github.com/JFernando1/AnalisisII-LAB/releases)


# Extract the id of the release from the creation response
#id=$(echo "$release" | sed -n -e 's/"id":\ \([0-9]\+\),/\1/p' | head -n 1 | sed 's/[[:blank:]]//g')
# Upload the artifact
#curl -XPOST -H "Content-Type:application/octet-stream" --data-binary @artifact.zip https://uploads.github.com/repos/<USERNAME>/#<REPOSITORY>/releases/$id/assets?name=artifact.zip

#33f82ac39e7ba8448cffe26f2ac53d1cdf6b9854
vrelease="$(git describe --tags)"

curl -H "Authorization:token $token"--data '{"tag_name": "$vrelase","target_commitish": "origin","name": "v$vrelease","body": "Release of version $vrelease","draft": false,"prerelease": false}' https://api.github.com/repos/JFernando1/AnalisisII-LAB/releases/

