INSERT INTO PROCESO (ID, NOMBRE, PESO, TIPO) VALUES (1,'P.C. 01. ACCIÓN TUTORIAL.',1,'CLAVE');
INSERT INTO PROCESO (ID, NOMBRE, PESO, TIPO) VALUES (2,'P.C. 02. ORIENTACIÓN Y ACOMPAÑAMIENTO DE ALUMNOS',2,'CLAVE');
INSERT INTO PROCESO (ID, NOMBRE, PESO, TIPO) VALUES (4,'P.C. 04. ATENCIÓN A LA DIVERSIDAD',3,'CLAVE');
INSERT INTO PROCESO (ID, NOMBRE, PESO, TIPO) VALUES (5,'P.C. 05. ACCIÓN DOCENTE (PROC. EDUC. EN EL AULA)',4,'CLAVE');
INSERT INTO PROCESO (ID, NOMBRE, PESO, TIPO) VALUES (7,'P.C. 07. GESTIÓN DE CONFLICTOS DISCIPLINARES. (de la convivencia)',5,'CLAVE');
INSERT INTO PROCESO (ID, NOMBRE, PESO, TIPO) VALUES (9,'P.C. 09. ADMISIÓN, MATRICULACIÓN Y ACOGIDA DE ALUMNOS',6,'CLAVE');
INSERT INTO PROCESO (ID, NOMBRE, PESO, TIPO) VALUES (10,'P.C. 10. ACCIÓN PASTORAL ESCOLAR',7,'CLAVE');
INSERT INTO PROCESO (ID, NOMBRE, PESO, TIPO) VALUES (12,'P.C. 12. IMAGEN DEL CENTRO',8,'CLAVE');
INSERT INTO PROCESO (ID, NOMBRE, PESO, TIPO) VALUES (14,'P.C. 14. FORMACIÓN EN CENTROS DE TRABAJO.',9,'CLAVE');
INSERT INTO PROCESO (ID, NOMBRE, PESO, TIPO) VALUES (6,'P.E. 06. MEJORA CONTINUA.',10,'ESTRATEGIA');


INSERT INTO INDICADOR (DTYPE, ID, ES_PORCENTAJE, NOMBRE, PROCESO_ID) VALUES ('UNIDAD',100, TRUE, 'IND 01.1 % Familias diferentes que se entrevistan con el tutor', 1);
INSERT INTO INDICADOR (DTYPE, ID, ES_PORCENTAJE, NOMBRE, PROCESO_ID) VALUES ('UNIDAD',101, TRUE, 'IND 01.2 % alumnos diferentes entrevistados por el tutor', 1);
INSERT INTO INDICADOR (DTYPE, ID, ES_PORCENTAJE, NOMBRE, PROCESO_ID) VALUES ('UNIDAD',102, FALSE, 'IND 01.3 Nº total de entrevistas realizadas por el tutor con alumnos', 1);
INSERT INTO INDICADOR (DTYPE, ID, ES_PORCENTAJE, NOMBRE, PROCESO_ID) VALUES ('UNIDAD',103, FALSE, 'IND 01.4 Nº total de entrevistas realizadas por el tutor con famillias', 1);
INSERT INTO INDICADOR (DTYPE, ID, ES_PORCENTAJE, NOMBRE, PROCESO_ID) VALUES ('UNIDAD',104, TRUE, 'IND 01.5 % de acciones del Plan de Acción Tutorial realizadas sobre las planificadas.', 1);
INSERT INTO INDICADOR (DTYPE, ID, ES_PORCENTAJE, NOMBRE, PROCESO_ID) VALUES ('UNIDAD',105, TRUE, 'IND 01.6 % de acciones del Plan de Acción Tutorial eficaces sobre las realizadas.', 1);
INSERT INTO INDICADOR (DTYPE, ID, ES_PORCENTAJE, NOMBRE, PROCESO_ID) VALUES ('UNIDAD',106, TRUE, 'IND 01.7 % Padres que asisten a las reuniones de tutoría grupal.', 1);
INSERT INTO INDICADOR (DTYPE, ID, ES_PORCENTAJE, NOMBRE, PROCESO_ID) VALUES ('UNIDAD',107, FALSE, 'IND 01.8 Grado de satisfacción de los alumnos con la acción tutorial', 1);
INSERT INTO INDICADOR (DTYPE, ID, ES_PORCENTAJE, NOMBRE, PROCESO_ID) VALUES ('UNIDAD',108, FALSE, 'IND 01.9 Grado de satisfacción de las familias con la acción tutorial', 1);
INSERT INTO INDICADOR (DTYPE, ID, ES_PORCENTAJE, NOMBRE, PROCESO_ID) VALUES ('UNIDAD',109, FALSE, 'IND 01.10 Grado de satisfacción de los profesores con la acción tutorial', 1);
INSERT INTO INDICADOR (DTYPE, ID, ES_PORCENTAJE, NOMBRE, PROCESO_ID) VALUES ('UNIDAD',110, FALSE, 'IND 01.11 Grado satisfacción profesores con las acciones tutoriales desarrolladas con los alumnos', 1);
INSERT INTO INDICADOR (DTYPE, ID, ES_PORCENTAJE, NOMBRE, PROCESO_ID) VALUES ('UNIDAD',111, TRUE, 'IND 02.1 % de pruebas colectivas realizadas sobre las planificadas.', 2);
INSERT INTO INDICADOR (DTYPE, ID, ES_PORCENTAJE, NOMBRE, PROCESO_ID) VALUES ('UNIDAD',112, TRUE, 'IND 02.2 % de acciones de Orientación profesional–vocacional realizadas sobre las planificadas', 2);
INSERT INTO INDICADOR (DTYPE, ID, ES_PORCENTAJE, NOMBRE, PROCESO_ID) VALUES ('UNIDAD',113, FALSE, 'IND 02.3 Grado de satisfacción de los alumnos con la orientación', 2);
INSERT INTO INDICADOR (DTYPE, ID, ES_PORCENTAJE, NOMBRE, PROCESO_ID) VALUES ('UNIDAD',114, FALSE, 'IND 02.4 Grado de Satisfacción de Familias con la Orientación', 2);
INSERT INTO INDICADOR (DTYPE, ID, ES_PORCENTAJE, NOMBRE, PROCESO_ID) VALUES ('UNIDAD',115, FALSE, 'IND 02.5 Grado de Satisfacción de los profesores con la Orientación', 2);
INSERT INTO INDICADOR (DTYPE, ID, ES_PORCENTAJE, NOMBRE, PROCESO_ID) VALUES ('UNIDAD',116, FALSE, 'IND 04.1 Porcentaje áreas-asignaturas-materias aprobadas de todo el alumnado con Adaptación Curricular No Significativa', 4);
INSERT INTO INDICADOR (DTYPE, ID, ES_PORCENTAJE, NOMBRE, PROCESO_ID) VALUES ('UNIDAD',117, FALSE, 'IND 04.2 Porcentaje áreas-asignaturas-materias aprobadas de todo el alumnado con Adaptación Curricular Significativa', 4);
INSERT INTO INDICADOR (DTYPE, ID, ES_PORCENTAJE, NOMBRE, PROCESO_ID) VALUES ('UNIDAD',118, FALSE, 'IND 04.3 Porcentaje áreas-asignaturas-materias aprobadas de todo el alumnado con refuerzo o apoyo.', 4);
INSERT INTO INDICADOR (DTYPE, ID, ES_PORCENTAJE, NOMBRE, PROCESO_ID) VALUES ('UNIDAD',119, FALSE, 'IND 04.4 Porcentaje otros programas valorados como eficaces.', 4);
INSERT INTO INDICADOR (DTYPE, ID, ES_PORCENTAJE, NOMBRE, PROCESO_ID) VALUES ('UNIDAD',120, TRUE, 'IND 04.5 % materias pendientes recuperadas (EP, ESO, Bach y FPB)', 4);
INSERT INTO INDICADOR (DTYPE, ID, ES_PORCENTAJE, NOMBRE, PROCESO_ID) VALUES ('UNIDAD',121, TRUE, 'IND 04.6 % alumnos repetidores que promocionan sin imperativo legal', 4);
INSERT INTO INDICADOR (DTYPE, ID, ES_PORCENTAJE, NOMBRE, PROCESO_ID) VALUES ('UNIDAD',122, FALSE, 'IND 04.7 Grado de satisfacción de los alumnos con las medidas de atención a la diversidad', 4);
INSERT INTO INDICADOR (DTYPE, ID, ES_PORCENTAJE, NOMBRE, PROCESO_ID) VALUES ('UNIDAD',123, FALSE, 'IND 04.8 Grado de satisfacción de las familias con las medidas de atención a la diversidad', 4);
INSERT INTO INDICADOR (DTYPE, ID, ES_PORCENTAJE, NOMBRE, PROCESO_ID) VALUES ('UNIDAD',124, FALSE, 'IND 04.9 Grado de satisfacción profesores con la Atención a la Diversidad', 4);
INSERT INTO INDICADOR (DTYPE, ID, ES_PORCENTAJE, NOMBRE, PROCESO_ID) VALUES ('UNIDAD',125, TRUE, 'IND 05.1 % alumnos que en este momento promocionarían de curso o titularían (imperativo legal)', 5);
INSERT INTO INDICADOR (DTYPE, ID, ES_PORCENTAJE, NOMBRE, PROCESO_ID) VALUES ('UNIDAD',126, TRUE, 'IND 05.2 % alumnos que en este momento promocionarían (basado en el nº real de suspensos)', 5);
INSERT INTO INDICADOR (DTYPE, ID, ES_PORCENTAJE, NOMBRE, PROCESO_ID) VALUES ('UNIDAD',127, TRUE, 'IND 05.3 % de alumnos sin suspensos', 5);
INSERT INTO INDICADOR (DTYPE, ID, ES_PORCENTAJE, NOMBRE, PROCESO_ID) VALUES ('UNIDAD',128, TRUE, 'IND 05.4 % alumnos con 3 o más suspensos', 5);
INSERT INTO INDICADOR (DTYPE, ID, ES_PORCENTAJE, NOMBRE, PROCESO_ID) VALUES ('UNIDAD',129, FALSE, 'IND 05.5 Porcentaje de alumnos que aprueban la PAU en Junio con respecto a los matriculados en 2º BACH', 5);
INSERT INTO INDICADOR (DTYPE, ID, ES_PORCENTAJE, NOMBRE, PROCESO_ID) VALUES ('UNIDAD',130, FALSE, 'IND 05.6 Nota media alumnos PAU (1ª convocatoria)', 5);
INSERT INTO INDICADOR (DTYPE, ID, ES_PORCENTAJE, NOMBRE, PROCESO_ID) VALUES ('UNIDAD',131, FALSE, 'IND 05.7 Diferencia entre media PAU y media Bachillerato (1ª convocatoria)', 5);
INSERT INTO INDICADOR (DTYPE, ID, ES_PORCENTAJE, NOMBRE, PROCESO_ID) VALUES ('UNIDAD',132, TRUE, 'IND 05.8 % de actividades complementarias programadas sobre las realizadas.', 5);
INSERT INTO INDICADOR (DTYPE, ID, ES_PORCENTAJE, NOMBRE, PROCESO_ID) VALUES ('UNIDAD',133, FALSE, 'IND 05.9 Grado de satisfacción de los alumnos con la acción docente', 5);
INSERT INTO INDICADOR (DTYPE, ID, ES_PORCENTAJE, NOMBRE, PROCESO_ID) VALUES ('UNIDAD',134, FALSE, 'IND 05.10 Grado de satisfacción de las familias con la acción docente', 5);
INSERT INTO INDICADOR (DTYPE, ID, ES_PORCENTAJE, NOMBRE, PROCESO_ID) VALUES ('UNIDAD',135, FALSE, 'IND 05.11 Grado de satisfacción de los profesores con la acción docente', 5);
INSERT INTO INDICADOR (DTYPE, ID, ES_PORCENTAJE, NOMBRE, PROCESO_ID) VALUES ('UNIDAD',136, FALSE, 'IND 05.12 Grado de satisfacción de los alumnos con las actividades complementarias', 5);
INSERT INTO INDICADOR (DTYPE, ID, ES_PORCENTAJE, NOMBRE, PROCESO_ID) VALUES ('UNIDAD',137, FALSE, 'IND 05.13 Grado de satisfacción del profesorado con las actividades complementarias', 5);
INSERT INTO INDICADOR (DTYPE, ID, ES_PORCENTAJE, NOMBRE, PROCESO_ID) VALUES ('UNIDAD',138, FALSE, 'IND 07.1 Nº de alumnos diferentes suspendidos del derecho de asistencia al centro', 7);
INSERT INTO INDICADOR (DTYPE, ID, ES_PORCENTAJE, NOMBRE, PROCESO_ID) VALUES ('UNIDAD',139, TRUE, 'IND 07.2 % de alumnos diferentes suspendidos del derecho de asistencia al centro', 7);
INSERT INTO INDICADOR (DTYPE, ID, ES_PORCENTAJE, NOMBRE, PROCESO_ID) VALUES ('UNIDAD',140, TRUE, 'IND 07.3 % alumnos diferentes con ausencias injustificadas en 2 o más días (en el mismo trimestre).', 7);
INSERT INTO INDICADOR (DTYPE, ID, ES_PORCENTAJE, NOMBRE, PROCESO_ID) VALUES ('UNIDAD',141, TRUE, 'IND 07.4 % alumnos diferentes con impuntualidades injustificadas (Se contabilizará a partir de 3 impuntualidades en el mismo trimestre)', 7);
INSERT INTO INDICADOR (DTYPE, ID, ES_PORCENTAJE, NOMBRE, PROCESO_ID) VALUES ('UNIDAD',142, FALSE, 'IND 07.5 Grado de satisfacción de los alumnos con la Gestión de Conflictos', 7);
INSERT INTO INDICADOR (DTYPE, ID, ES_PORCENTAJE, NOMBRE, PROCESO_ID) VALUES ('UNIDAD',143, FALSE, 'IND 07.6 Grado de satisfacción de las Familias con la Gestión de Conflictos', 7);
INSERT INTO INDICADOR (DTYPE, ID, ES_PORCENTAJE, NOMBRE, PROCESO_ID) VALUES ('UNIDAD',144, FALSE, 'IND 07.7 Grado de satisfacción del profesorado con la Gestión de Conflictos', 7);
INSERT INTO INDICADOR (DTYPE, ID, ES_PORCENTAJE, NOMBRE, PROCESO_ID) VALUES ('UNIDAD',145, TRUE, 'IND 09.1 % de ocupación (n.º alumnos/ratio)', 9);
INSERT INTO INDICADOR (DTYPE, ID, ES_PORCENTAJE, NOMBRE, PROCESO_ID) VALUES ('UNIDAD',146, FALSE, 'IND 09.2 Porcentaje de solicitudes recibidas como primera opción respecto a plazas ofertadas', 9);
INSERT INTO INDICADOR (DTYPE, ID, ES_PORCENTAJE, NOMBRE, PROCESO_ID) VALUES ('UNIDAD',147, FALSE, 'IND 09.3 Nº solicitudes recibidas (por curso)', 9);
INSERT INTO INDICADOR (DTYPE, ID, ES_PORCENTAJE, NOMBRE, PROCESO_ID) VALUES ('UNIDAD',148, FALSE, 'IND 09.4 Nº de alumnos que se dan de baja ', 9);
INSERT INTO INDICADOR (DTYPE, ID, ES_PORCENTAJE, NOMBRE, PROCESO_ID) VALUES ('UNIDAD',149, FALSE, 'IND 09.5 Grado de satisfacción de alumnos de nuevo ingreso con la Admisión, Matriculación y Acogida de alumnos', 9);
INSERT INTO INDICADOR (DTYPE, ID, ES_PORCENTAJE, NOMBRE, PROCESO_ID) VALUES ('UNIDAD',150, FALSE, 'IND 09.6 Grado de satisfacción de las Familias de nuevo ingreso con la Admisión, Matriculación y Acogida de alumnos', 9);
INSERT INTO INDICADOR (DTYPE, ID, ES_PORCENTAJE, NOMBRE, PROCESO_ID) VALUES ('UNIDAD',151, TRUE, 'IND 10.1 % alumnos que participan en actividades voluntarias de pastoral escolar (celebraciones, retiros, convivencias, …)', 10);
INSERT INTO INDICADOR (DTYPE, ID, ES_PORCENTAJE, NOMBRE, PROCESO_ID) VALUES ('UNIDAD',152, FALSE, 'IND 10.2 Grado de satisfacción de los alumnos con la Pastoral', 10);
INSERT INTO INDICADOR (DTYPE, ID, ES_PORCENTAJE, NOMBRE, PROCESO_ID) VALUES ('UNIDAD',153, FALSE, 'IND 10.3 Grado de satisfacción de las Familias con la Pastoral', 10);
INSERT INTO INDICADOR (DTYPE, ID, ES_PORCENTAJE, NOMBRE, PROCESO_ID) VALUES ('UNIDAD',154, FALSE, 'IND 10.4 Grado de satisfacción del profesorado con la Pastoral', 10);
INSERT INTO INDICADOR (DTYPE, ID, ES_PORCENTAJE, NOMBRE, PROCESO_ID) VALUES ('UNIDAD',155, FALSE, 'IND 12.1 Nº Reconocimientos / premios concedidos por parte de entidades externas ', 12);
INSERT INTO INDICADOR (DTYPE, ID, ES_PORCENTAJE, NOMBRE, PROCESO_ID) VALUES ('UNIDAD',156, FALSE, 'IND 12.2 Nº de ocasiones en los que el centro aparece en los medios de comunicación (medios externos a Salesianos)', 12);
INSERT INTO INDICADOR (DTYPE, ID, ES_PORCENTAJE, NOMBRE, PROCESO_ID) VALUES ('UNIDAD',157, FALSE, 'IND 12.3 Número de actividades en las que el Centro colabora con otras instituciones externas', 12);
INSERT INTO INDICADOR (DTYPE, ID, ES_PORCENTAJE, NOMBRE, PROCESO_ID) VALUES ('UNIDAD',158, FALSE, 'IND 12.4 Grado de satisfacción de los alumnos con la Imagen del Centro', 12);
INSERT INTO INDICADOR (DTYPE, ID, ES_PORCENTAJE, NOMBRE, PROCESO_ID) VALUES ('UNIDAD',159, FALSE, 'IND 12.5 Grado de satisfacción de las Familias con la Imagen del Centro', 12);
INSERT INTO INDICADOR (DTYPE, ID, ES_PORCENTAJE, NOMBRE, PROCESO_ID) VALUES ('UNIDAD',160, FALSE, 'IND 12.6 Grado de satisfacción del profesorado con la Imagen del Centro', 12);
INSERT INTO INDICADOR (DTYPE, ID, ES_PORCENTAJE, NOMBRE, PROCESO_ID) VALUES ('UNIDAD',161, FALSE, 'IND 12.7 Grado de satisfacción de los padres con la Plataforma "QE Escuela-Familia"', 12);
INSERT INTO INDICADOR (DTYPE, ID, ES_PORCENTAJE, NOMBRE, PROCESO_ID) VALUES ('UNIDAD',162, TRUE, 'IND 14.1 % de alumnos matriculados en segundo curso que realizan el módulo de FCT', 14);
INSERT INTO INDICADOR (DTYPE, ID, ES_PORCENTAJE, NOMBRE, PROCESO_ID) VALUES ('UNIDAD',163, TRUE, 'IND 14.2 % de alumnos que aprueban con apto el módulo de FCT sobre los que han realizado la FCT.', 14);
INSERT INTO INDICADOR (DTYPE, ID, ES_PORCENTAJE, NOMBRE, PROCESO_ID) VALUES ('UNIDAD',164, TRUE, 'IND 14.3 % de alumnos contratados en empresas tras haber terminado la FCT', 14);
INSERT INTO INDICADOR (DTYPE, ID, ES_PORCENTAJE, NOMBRE, PROCESO_ID) VALUES ('UNIDAD',165, FALSE, 'IND 14.4 Grado de satisfaccion de los alumnos con la FCT', 14);
INSERT INTO INDICADOR (DTYPE, ID, ES_PORCENTAJE, NOMBRE, PROCESO_ID) VALUES ('UNIDAD',166, FALSE, 'IND 14.5 Grado de satisfacción de las empresas con la FCT', 14);
INSERT INTO INDICADOR (DTYPE, ID, ES_PORCENTAJE, NOMBRE, PROCESO_ID) VALUES ('UNIDAD',167, FALSE, 'IND 06.1 E Mejora en indicadores medición objetiva definida en el PSM ', 6);
INSERT INTO INDICADOR (DTYPE, ID, ES_PORCENTAJE, NOMBRE, PROCESO_ID) VALUES ('UNIDAD',168, FALSE, 'IND 06.2 E Mejora en indicadores de la satisfacción del cliente', 6);
