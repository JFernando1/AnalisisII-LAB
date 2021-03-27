version="$(git describe --tags)"
echo "$version"

VERSION_BITS=(${version//./ })

###echo ${VERSION_BITS[0]}
#echo ${VERSION_BITS[1]}
#echo ${VERSION_BITS[2]}
#echo $(git tag -d 1.0.0)"
##echo $(git tag 1.0.0)"

nversion=${VERSION_BITS[2]}
#echo ${nversion:0:1}
nversion=${nversion:0:1}
nversion=$((nversion+1))
newversion=${VERSION_BITS[0]}.${VERSION_BITS[1]}.$nversion
echo "Creando un nuevo tag de la version $version a $newversion"

#echo $(git describe --tags)"
#echo "$(git tag -d 1.0.1)"
#echo "$(git tag -d 1.0.2)"
#echo "$(git tag -d 1.0.3)"
#echo "$(git tag -d 1.0.4)"
#echo "$(git tag -d 1.0.5)"
#echo "$(git tag -d 1.0.6)"
#echo $(git tag -d 1.0.7)"
#echo $(git tag -d 1.0.8)"


#crear nuevo tag
#echo "$(git tag $newversion)"
#push del nuevo tag
#echo "$(git push https://${USERNAME}:${encodedPass}@github.com/JFernando1/AnalisisII-LAB.git  --tags)"
 

#pushing to repository
echo "Ejecutando push al repositorio"
#echo "$(git config user.email \"fernalgz@cunori.edu.gt\")"
##echo "$(git config user.name \"JFernando1\")"
#
#echo "$(git branch -M master .)"
echo "$(git branch)"
echo "$(git add .)"
###echo "$(git merge master)"
echo "$(git commit -m \"war\")"
echo "$(git push https://${USERNAME}:${encodedPass}@github.com/JFernando1/AnalisisII-LAB.git origin refs/remotes/origin/master)"














#git remote add origin https://bash_script:4b515ff5f9214ecd2490ba41ea7a6ef689fbb3e6@github.com/JFernando1/AnalisisII-LAB.git
#git push https://bash_script:
#4b515ff5f9214ecd2490ba41ea7a6ef689fbb3e6@github.com/
#JFernando1/AnalisisII-LAB.git
 
