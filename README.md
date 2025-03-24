# Bike Comparator Project

## Descripción del Proyecto

Este proyecto tiene como objetivo crear un comparador de bicicletas que permita a los usuarios filtrar y comparar diferentes modelos basados en varios criterios, como el tipo de cambio (mecánico o electrónico), el tipo de freno (disco o mecánico), el material del cuadro (carbono o aluminio), y el uso de la bicicleta (Carretera, Montaña, Gravel). La información será obtenida a través de **web scraping** de diferentes marcas y sitios web oficiales, lo que permitirá que el comparador esté actualizado con las bicicletas más recientes del mercado.

El proyecto estará basado en un **back-end de Spring Boot** utilizando **Thymeleaf** como motor de plantillas para el front-end. La interfaz de usuario utilizará **Bootstrap** para asegurar una presentación moderna y responsiva.

## Funcionalidades

- **Filtrado de bicicletas**: Los usuarios podrán filtrar bicicletas por uso (Carretera, Montaña, Gravel), tipo de freno, tipo de cambio y material.
- **Comparación de bicicletas**: Los usuarios podrán comparar bicicletas de diferentes marcas en función de las especificaciones seleccionadas.
- **Obtención de datos**: Utilizando **web scraping**, se extraerán enlaces de colecciones de modelos de diferentes marcas (o una marca si el tiempo es limitado) y se almacenarán en una base de datos para evitar bloqueos por parte de los sitios web.
- **Especificaciones detalladas**: Cada bicicleta mostrará sus especificaciones principales y tendrá un enlace que llevará al usuario a la página original para obtener más detalles o ver variantes de componentes y precios.
- **Interfaz intuitiva**: Al ingresar a la página, los usuarios verán todas las bicicletas ordenadas por precio de mayor a menor, con un botón para ver más detalles y otro para comparar.

## Tecnologías

- **Back-End**: Spring Boot
- **Front-End**: Thymeleaf, Bootstrap
- **Web Scraping**: Uso de herramientas específicas de web scraping para obtener los datos de las bicicletas de diferentes webs de marcas.
- **Base de Datos**: Almacenamiento de los modelos de bicicletas en una base de datos para acceder rápidamente a los datos sin realizar scraping cada vez que se acceda al sitio.
- **Integración con ChatGPT**: Posibilidad de usar inteligencia artificial para enriquecer los datos de las bicicletas o realizar consultas avanzadas.

## Estructura

### 1. Página principal

Al ingresar a la URL, los usuarios verán una lista de bicicletas ordenada por precio (de mayor a menor). Habrá filtros disponibles para personalizar la búsqueda según los siguientes criterios:

- Tipo de bicicleta (Carretera, Montaña, Gravel)
- Material del cuadro (Carbono, Aluminio)
- Tipo de freno (Mecánico, Disco)
- Tipo de cambio (Mecánico, Electrónico)

Cada bicicleta tendrá los siguientes elementos:

- Imagen de la bicicleta.
- Nombre del modelo.
- Precio.
- Especificaciones principales (freno, cambio, material).
- Botón de "Ver" para obtener más detalles.
- Botón de "Comparar" para añadir la bicicleta al comparador.

### 2. Página de Comparación

En la página de comparación, los usuarios podrán comparar las bicicletas que hayan seleccionado. La comparación mostrará las especificaciones clave de las bicicletas en columnas, permitiendo ver las diferencias fácilmente.

### 3. Página de detalles del modelo

Cada bicicleta tendrá un enlace debajo de las especificaciones con el texto "Más info", que llevará a los usuarios a la página oficial del modelo. En esa página, los usuarios podrán ver más detalles, como variaciones de componentes y precios diferentes según las configuraciones seleccionadas.

## Web Scraping

El scraping se realizará utilizando herramientas específicas para acceder a las páginas de modelos de bicicletas de diferentes marcas (por ejemplo, Berria y otras marcas). Los datos de cada bicicleta se extraerán y almacenarán en una base de datos local, lo que evitará la necesidad de hacer scraping en cada solicitud de usuario.

### Flujo de Web Scraping:

1. **Extracción de enlaces**: Se accederá a páginas específicas de colecciones de bicicletas por tipo de uso y se extraerán los enlaces a los modelos.
2. **Obtención de información de los modelos**: Se extraerán las especificaciones de cada bicicleta (precio, componentes, tipo de freno, etc.).
3. **Almacenamiento en base de datos**: Los datos extraídos se almacenarán en una base de datos para que estén disponibles rápidamente sin necesidad de volver a hacer scraping.

## Objetivo

El objetivo de este proyecto es ayudar a los usuarios a tomar decisiones informadas al comparar diferentes bicicletas de manera sencilla y rápida, ahorrándoles el tiempo que perderían buscando en múltiples sitios web. Este comparador tiene como inspiración el comparador de bicicletas de Orbea, pero con la idea de expandirlo a una mayor variedad de marcas y modelos.