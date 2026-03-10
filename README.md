# AUTO_FRONT_POM_FACTORY



## Flujo cubierto

**Cambio de estado de ticket desde el Dashboard**

| Paso | Acción |
|------|--------|
| 1 | El agente navega al Dashboard de gestión de tickets |
| 2 | Verifica que los tickets están cargados en la tabla |
| 3 | Selecciona el primer ticket de la lista |
| 4 | Se visualiza el modal de cambio de estado |
| 5 | Elige el estado "En Progreso" en el modal |
| 6 | Confirma el cambio de estado |
| 7 | El modal se cierra confirmando que el estado fue actualizado |

---

## Requisitos previos

- Java 17+
- Google Chrome instalado (ChromeDriver se descarga automáticamente)
- Stack completo levantado con Docker:

```bash
# Desde la raíz de AUTO_FRONT_POM_FACTORY/
docker compose up -d
```

La aplicación frontend queda disponible en `http://localhost:80`.

Proyecto testeado -> [https://github.com/AITraining-SofkaProyects-Team2](https://github.com/AITraining-SofkaProyects-Team2)

---

## Ejecución de las pruebas

```bash
./gradlew clean test aggregate
```

El reporte Serenity se genera en:

```
target/site/serenity/index.html
```

Abrirlo en el navegador para ver el resultado completo con capturas de pantalla por cada paso.

---

## Estructura del proyecto

```
AUTO_FRONT_POM_FACTORY/
├── build.gradle                             # Dependencias y configuración de Gradle
├── settings.gradle
└── src/test/
    ├── java/co/sofka/automation/
    │   ├── pages/
    │   │   ├── PaginaDashboard.java          # Tabla de tickets (@FindBy)
    │   │   └── PaginaModalCambioEstado.java  # Modal de cambio de estado (@FindBy)
    │   ├── steps/
    │   │   └── PasosCambioEstado.java        # Step Definitions en español
    │   └── runners/
    │       └── CucumberRunner.java           # Runner JUnit 4 + Serenity
    └── resources/
        ├── features/
        │   └── cambio_estado.feature         # Escenario Gherkin en español
        └── serenity.conf                     # Configuración del driver y URL base
```

---

## Stack tecnológico

| Herramienta | Versión | Rol |
|-------------|---------|-----|
| Java | 17 | Lenguaje |
| Gradle | 8.11 | Gestor de dependencias y build |
| Serenity BDD | 4.1.14 | Framework de automatización y reportes |
| Cucumber | 7.18.1 | Runner BDD (Gherkin en español) |
| Selenium WebDriver | transitivo vía Serenity | Automatización del navegador |
| JUnit | 4.13.2 | Runner de tests |
| AssertJ | 3.26.3 | Aserciones fluidas |
| Chrome | auto-descargado | Navegador (ChromeDriver automático) |