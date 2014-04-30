Las clases java se encuentran en books-api/src/main/java/edu/upc/.../api

Y las clases java son las siguiente:
	- BookResource.java (para una determinada petición, qué debe hacer
	- BooksApplication.java
	- DataSourceSPA.java
	- MediaType.java
	- MyResource.java (archivo de prueba inicial)

	+ faltan añadir excepciones para los posibles errores (not found, Conflict, forbidden)

En model se encuentran las clases o objetos:
	- Book.java (descripción de los parámetros que define un libro con getters y setters)
	- BookCollection.java (clase que hace array de books)
	- Review.java (descripción de la reseñas)
	- User.java (descripción del usuario)

Por otro lado, en la carpeta sql se encuentran los archivos para crear el usuario booksdb, la base de datos y los datos a añadir a la base de datos. Hacer source del archivo schema y después del data.

