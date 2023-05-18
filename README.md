1.- Crear el proyecto java, importante instalar la extensión "git graph"
<br>
2.- Crear la rama "HotFix" con el comando "git branch Hotfix"
<br>
3.- Me cambio a la rama creada "Hotfix" con el comando "git checkout Hotfix"
<br>
4.- Añado algo de contenido al App.java para tener algo con lo que poder trabajar y lo añado a git con el comando "git add src/App.java"
<br>
3.- Crear las ramas "Release", "Develop" y "Feature" con los comandos "git branch Release" "git branch Develop" "git branch Feature"
<br>
5.- Ahora me muevo a la rama Feature con el comando "git checkout Feature" y añado mas contenido al App.java haciendo un Commit & Push con un comentario
<br>
6.- Ahora vamos a fusionar las ramas Develop y Hotfix haciendo la siguiente serie de comandos
<br>
  <p>&nbsp6.1.- Nos movemos a la rama Develop con "git checkout Develop"</p>
  <br>
  <p>&nbsp6.2.- Fusionamos la rama Develop que es en la que nos encontramos con la rama Hotfix con "git merge Hotfix"</p>
  <br>
7.- Para provocar un fallo me dirijo a la rama Hotfix con "git checkout Hotfix" y elimino una parte del código del App.java para crear el conflicto
<br>
8.- Cuando he hecho el commit me dirijo a la rama Feature para fusionarla con la rama Hotfix y se origine el error
<br>
9.- Nos dirijimos a Feature con "git checkout Feature" y hacemos la fusion de las ramas con "git merge Hotfix" que dará el error(
<br>
warning: Cannot merge binary files: bin/App.class (HEAD vs. Hotfix)
<br>
Auto-merging bin/App.class
<br>
CONFLICT (content): Merge conflict in bin/App.class
<br>
Auto-merging src/App.java
<br>
Automatic merge failed; fix conflicts and then commit the result.
<br>
)
<br>
10.- Ahora modificamos el código de la rama Feature para que coincida con el de la rama HotFix y hacemos un Commit & Push con un comentario
