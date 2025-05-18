SISTEMA DE GESTIÓN DE BIBLIOTECA - COLEGIO AMIGOS DE DON BOSCO
=============================================================

1. DESCRIPCIÓN

Sistema desktop para gestión integral de biblioteca que permite:
- Registrar y consultar libros, revistas, tesis, CDs y obras
- Controlar préstamos a alumnos y profesores
- Generar reportes de mora y disponibilidad
-----------------------
2. EQUIPO DE DESARROLLO

Integrantes:
1. Jeferson Alfredo Romero Rivas - RR222321
2. Jonathan Alexander Alberto Cruz - AC200739
3. David Roberto Ferrer Coto - FC243112
4. Angel Marcelo Delgado Estrada - DE241507

-----------------------
3. ROLES DE USUARIO

- ADMINISTRADOR:
  * Gestiona usuarios y ejemplares
  * Configura sistema y moras
- PROFESOR:
  * Consultas avanzadas
  * Préstamos extendidos
- ALUMNO:
  * Autoconsulta
  * Solicitud de préstamos
-----------------------
4. MÓDULOS PRINCIPALES

4.1 Gestión de Usuarios
  - Registro/Edición de usuarios
  - Restablecimiento de contraseñas

4.2 Catálogo de Ejemplares
  - Libros: ISBN, editorial, autor
  - Revistas: ISSN, periodicidad
  - Tesis: Universidad, año
  - CDs: Artista, género
  - Obras: Tipo, técnica

4.3 Préstamos
  - Validación automática:
    * Límite de ejemplares
    * Estado de mora
    * Disponibilidad
  - Cálculo de mora diaria
    
-----------------------
5. INSTALACIÓN

Requisitos:
- Java JDK 8+
- MySQL 5.7+
- Librerías en /lib

Pasos:
1. Clonar repositorio:
   git clone https://github.com/tu-repositorio/biblioteca-udb.git

2. Importar base de datos:
   /database/biblioteca_udb.sql

3. Configurar conexión:
   Editar ConexionBD.java con credenciales MySQL

6. CREDENCIALES DEMO
--------------------
Administrador: admin / admin123
Profesor: tsanchez / tsanchez
Alumno: alumno / alumno

