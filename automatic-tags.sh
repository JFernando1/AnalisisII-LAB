version="$(git describe --tags)"
echo "$version"

VERSION_BITS=(${version//./ })


nversion=  ${VERSION_BITS[2]}
nversion=$((nversion+1))
newversion=${VERSION_BITS[0]}.${VERSION_BITS[1]}.$nversion
echo "Creando un nuevo tag de la version $version a $newversion"

#echo $(git tag $newversion)"
echo "$(git push https://bash_script:4b515ff5f9214ecd2490ba41ea7a6ef689fbb3e6@github.com/JFernando1/AnalisisII-LAB.git --tag)"
 
#git remote add origin https://bash_script:4b515ff5f9214ecd2490ba41ea7a6ef689fbb3e6@github.com/JFernando1/AnalisisII-LAB.git
#git push https://bash_script:
#4b515ff5f9214ecd2490ba41ea7a6ef689fbb3e6@github.com/
#JFernando1/AnalisisII-LAB.git
 
