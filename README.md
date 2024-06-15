Basado en el siguiente problema elabore un un diagrama de clases que lo represente.
uniLocal es una plataforma que incentiva el comercio y la gastronomía regional, donde se busca apoyar a
los pequeños comerciantes. En dicha plataforma los usuarios podrán buscar lugares como: restaurantes,
cafeterías, comidas rápidas, museos y hoteles que sean de interés y que se encuentren a una distancia
razonable del usuario. Para esto, se debe hacer uso de un mapa en donde se deben mostrar todos los
lugares y se debe contar con un buscador para poder filtrar lugares según lo que el usuario esté buscando.
Cada lugar debe tener imágenes (al menos una), una descripción, un nombre, horarios, teléfonos, categoría,
comentarios y calificaciones. Solo los usuarios registrados pueden comentar y calificar lugares, del usuario
se requiere su nombre, foto de perfil, nickname, email, contraseña y ciudad de residencia para crear una
cuenta.
Los lugares que aparecen en la plataforma son creados por los mismos usuarios, un usuario debe tener una
cuenta activa para poder crear un lugar, al momento de crear el lugar se debe mostrar un mapa para que el
usuario lo ubique. La plataforma debe contar con uno o varios moderadores que se encarguen de verificar
que los lugares publicados sean reales y que no incumplan las normas de uso.
Una funcionalidad importante que debe tener la plataforma es que debe mostrar la ruta entre el usuario y el
lugar al que quiera ir, se debe mostrar además, el tiempo aproximado que se demora para llegar al lugar y la
distancia en kilómetros.
Funcionalidades por rol:
NOTA: Todos los roles deben poder iniciar sesión desde la misma plataforma.
Moderador
● Autorizar o rechazar lugares.
● Debe quedar registro de qué lugar fue autorizado o denegado por un moderador.
● La pantalla inicial del moderador debe tener una lista de lugares que están pendientes de ser
autorizados y los lugares que han sido autorizados o rechazados por él.
Usuario
● Registrarse.
● Recuperar contraseña por email.
● Ver en un mapa todos los lugares que han sido publicados. Los lugares deben aparecer en función
de la ubicación del usuario.
● Crear lugares, editarlos y eliminarlos.
● Comentar y calificar los lugares por medio de estrellas.
● Gestión de favoritos (marcar lugares como favoritos, quitarlos, etc)
● Buscar lugares por nombre, tipo, distancia.
● Solicitar ruta entre su ubicación y la ubicación del lugar. Esta ruta debe mostrar distancia y tiempo
de viaje.
● Si el usuario ha creado lugares, debe tener una página donde pueda ver la lista de lugares que ha
creado y responder los comentarios que le han hecho.
● Eliminar su propia cuenta.
● Recomendar lugares en función de las búsquedas que realiza.
Para tener en cuenta:
● Para la parte de los mapas se recomienda usar Mapbox (https://www.mapbox.com/). En futuras
clases les explicaré cómo implementarlo en el proyecto.
● Cuando se autoriza o rechaza un lugar se le debe enviar un correo electrónico al usuario que lo
creó.
● Si un moderador rechaza un lugar debe escribir un motivo por el que lo hizo y el usuario que creó el
lugar tiene 5 días para hacer las modificaciones pertinentes y enviarlo de nuevo a revisión.
● Si un lugar tiene más de 5 días en el estado rechazado se debe eliminar.
● Se debe mostrar si el lugar está abierto o no en función de la hora actual y del horario definido para
dicho lugar.
● Una vez registrado, los usuarios al olvidar su contraseña pueden cambiarla por medio de un link
enviado a su correo electrónico.
● Cuando un cliente hace un comentario en un lugar, se debe enviar un email (al usuario que creó el
lugar) con lo que escribió la persona. De igual forma debe pasar cuando le respondan un
comentario al usuario.
● Para el manejo de imágenes se debe hacer uso de un servicio externo, puede ser Cloudinary,
Firebase, Flickr, etc.
● El código fuente del proyecto debe estar en un repositorio de Github. Todos los integrantes del
grupo deben contribuir en el desarrollo del proyecto.
● Los moderadores están precargados en la base de datos
