-- insert provincias

INSERT INTO minimarket.provincias (id, nombre, is_active)
VALUES
    (1, 'San José', TRUE),
    (2, 'Alajuela', TRUE),
    (3, 'Cartago', TRUE),
    (4, 'Heredia', TRUE),
    (5, 'Guanacaste', TRUE),
    (6, 'Puntarenas', TRUE),
    (7, 'Limón', TRUE);


INSERT INTO minimarket.cantones (id, provincia_id, nombre, is_active)
VALUES
    -- San José (provincia_id = 1)
    (101, 1, 'San José', TRUE),
    (102, 1, 'Escazú', TRUE),
    (103, 1, 'Desamparados', TRUE),
    (104, 1, 'Puriscal', TRUE),
    (105, 1, 'Tarrazú', TRUE),
    (106, 1, 'Aserrí', TRUE),
    (107, 1, 'Mora', TRUE),
    (108, 1, 'Goicoechea', TRUE),
    (109, 1, 'Santa Ana', TRUE),
    (110, 1, 'Alajuelita', TRUE),
    (111, 1, 'Vázquez de Coronado', TRUE),
    (112, 1, 'Acosta', TRUE),
    (113, 1, 'Tibás', TRUE),
    (114, 1, 'Moravia', TRUE),
    (115, 1, 'Montes de Oca', TRUE),
    (116, 1, 'Turrubares', TRUE),
    (117, 1, 'Dota', TRUE),
    (118, 1, 'Curridabat', TRUE),
    (119, 1, 'Pérez Zeledón', TRUE),
    (120, 1, 'León Cortés Castro', TRUE),

    -- Alajuela (provincia_id = 2)
    (201, 2, 'Alajuela', TRUE),
    (202, 2, 'San Ramón', TRUE),
    (203, 2, 'Grecia', TRUE),
    (204, 2, 'San Mateo', TRUE),
    (205, 2, 'Atenas', TRUE),
    (206, 2, 'Naranjo', TRUE),
    (207, 2, 'Palmares', TRUE),
    (208, 2, 'Poás', TRUE),
    (209, 2, 'Orotina', TRUE),
    (210, 2, 'San Carlos', TRUE),
    (211, 2, 'Zarcero', TRUE),
    (212, 2, 'Sarchí', TRUE),
    (213, 2, 'Upala', TRUE),
    (214, 2, 'Los Chiles', TRUE),
    (215, 2, 'Guatuso', TRUE),
    (216, 2, 'Río Cuarto', TRUE),

    -- Cartago (provincia_id = 3)
    (301, 3, 'Cartago', TRUE),
    (302, 3, 'Paraíso', TRUE),
    (303, 3, 'La Unión', TRUE),
    (304, 3, 'Jiménez', TRUE),
    (305, 3, 'Turrialba', TRUE),
    (306, 3, 'Alvarado', TRUE),
    (307, 3, 'Oreamuno', TRUE),
    (308, 3, 'El Guarco', TRUE),

    -- Heredia (provincia_id = 4)
    (401, 4, 'Heredia', TRUE),
    (402, 4, 'Barva', TRUE),
    (403, 4, 'Santo Domingo', TRUE),
    (404, 4, 'Santa Bárbara', TRUE),
    (405, 4, 'San Rafael', TRUE),
    (406, 4, 'San Isidro', TRUE),
    (407, 4, 'Belén', TRUE),
    (408, 4, 'Flores', TRUE),
    (409, 4, 'San Pablo', TRUE),
    (410, 4, 'Sarapiquí', TRUE),

    -- Guanacaste (provincia_id = 5)
    (501, 5, 'Liberia', TRUE),
    (502, 5, 'Nicoya', TRUE),
    (503, 5, 'Santa Cruz', TRUE),
    (504, 5, 'Bagaces', TRUE),
    (505, 5, 'Carrillo', TRUE),
    (506, 5, 'Cañas', TRUE),
    (507, 5, 'Abangares', TRUE),
    (508, 5, 'Tilarán', TRUE),
    (509, 5, 'Nandayure', TRUE),
    (510, 5, 'La Cruz', TRUE),
    (511, 5, 'Hojancha', TRUE),

    -- Puntarenas (provincia_id = 6)
    (601, 6, 'Puntarenas', TRUE),
    (602, 6, 'Esparza', TRUE),
    (603, 6, 'Buenos Aires', TRUE),
    (604, 6, 'Montes de Oro', TRUE),
    (605, 6, 'Osa', TRUE),
    (606, 6, 'Quepos', TRUE),
    (607, 6, 'Golfito', TRUE),
    (608, 6, 'Coto Brus', TRUE),
    (609, 6, 'Parrita', TRUE),
    (610, 6, 'Corredores', TRUE),
    (611, 6, 'Garabito', TRUE),
    (612, 6, 'Monteverde', TRUE),

    -- Limón (provincia_id = 7)
    (701, 7, 'Limón', TRUE),
    (702, 7, 'Pococí', TRUE),
    (703, 7, 'Siquirres', TRUE),
    (704, 7, 'Talamanca', TRUE),
    (705, 7, 'Matina', TRUE),
    (706, 7, 'Guácimo', TRUE);

    commit;


    INSERT INTO minimarket.distritos (id, canton_id, nombre, is_active)
VALUES
    -- Cantón 101: San José
    (10101, 101, 'Carmen', TRUE),
    (10102, 101, 'Merced', TRUE),
    (10103, 101, 'Hospital', TRUE),
    (10104, 101, 'Catedral', TRUE),
    (10105, 101, 'Zapote', TRUE),
    (10106, 101, 'San Francisco de Dos Ríos', TRUE),
    (10107, 101, 'Uruca', TRUE),
    (10108, 101, 'Mata Redonda', TRUE),
    (10109, 101, 'Pavas', TRUE),
    (10110, 101, 'Hatillo', TRUE),
    (10111, 101, 'San Sebastián', TRUE),

    -- Cantón 102: Escazú
    (10201, 102, 'Escazú', TRUE),
    (10202, 102, 'San Antonio', TRUE),
    (10203, 102, 'San Rafael', TRUE),

    -- Cantón 103: Desamparados
    (10301, 103, 'Desamparados', TRUE),
    (10302, 103, 'San Miguel', TRUE),
    (10303, 103, 'San Juan de Dios', TRUE),
    (10304, 103, 'San Rafael Arriba', TRUE),
    (10305, 103, 'San Antonio', TRUE),
    (10306, 103, 'Frailes', TRUE),
    (10307, 103, 'Patarra', TRUE),
    (10308, 103, 'San Cristobal', TRUE),
    (10309, 103, 'Rosario', TRUE),
    (10310, 103, 'Damas', TRUE),
    (10311, 103, 'San Rafael Abajo', TRUE),
    (10312, 103, 'Gravilias', TRUE),
    (10313, 103, 'Los Guido', TRUE),

    -- Cantón 104: Puriscal
    (10401, 104, 'Santiago', TRUE),
    (10402, 104, 'Mercedes Sur', TRUE),
    (10403, 104, 'Barbacoas', TRUE),
    (10404, 104, 'Grifo Alto', TRUE),
    (10405, 104, 'San Rafael', TRUE),
    (10406, 104, 'Candelarita', TRUE),
    (10407, 104, 'Desamparaditos', TRUE),
    (10408, 104, 'San Antonio', TRUE),
    (10409, 104, 'Chires', TRUE),

    -- Cantón 105: Tarrazú
    (10501, 105, 'San Marcos', TRUE),
    (10502, 105, 'San Lorenzo', TRUE),
    (10503, 105, 'San Carlos', TRUE),

    -- Cantón 106: Aserrí
    (10601, 106, 'Aserrí', TRUE),
    (10602, 106, 'Tarbaca', TRUE),
    (10603, 106, 'Vuelta de Jorco', TRUE),
    (10604, 106, 'San Gabriel', TRUE),
    (10605, 106, 'Legua', TRUE),
    (10606, 106, 'Monterrey', TRUE),
    (10607, 106, 'Salitrillos', TRUE),

    -- Cantón 107: Mora
    (10701, 107, 'Colón', TRUE),
    (10702, 107, 'Guayabo', TRUE),
    (10703, 107, 'Tabarcia', TRUE),
    (10704, 107, 'Piedras Negras', TRUE),
    (10705, 107, 'Picagres', TRUE),
    (10706, 107, 'Jaris', TRUE),
    (10707, 107, 'Quitirrisí', TRUE),

    -- Cantón 108: Goicoechea
    (10801, 108, 'Guadalupe', TRUE),
    (10802, 108, 'San Francisco', TRUE),
    (10803, 108, 'Calle Blancos', TRUE),
    (10804, 108, 'Mata de Plátano', TRUE),
    (10805, 108, 'Ipis', TRUE),
    (10806, 108, 'Rancho Redondo', TRUE),
    (10807, 108, 'Purral', TRUE),

    -- Cantón 109: Santa Ana
    (10901, 109, 'Santa Ana', TRUE),
    (10902, 109, 'Salitral', TRUE),
    (10903, 109, 'Pozos', TRUE),
    (10904, 109, 'Uruca', TRUE),
    (10905, 109, 'Piedades', TRUE),
    (10906, 109, 'Brasil', TRUE),

    -- Cantón 110: Alajuelita
    (11001, 110, 'Alajuelita', TRUE),
    (11002, 110, 'San Josecito', TRUE),
    (11003, 110, 'San Antonio', TRUE),
    (11004, 110, 'Concepción', TRUE),
    (11005, 110, 'San Felipe', TRUE),

    -- Cantón 111: Vázquez de Coronado
    (11101, 111, 'San Isidro', TRUE),
    (11102, 111, 'San Rafael', TRUE),
    (11103, 111, 'Dulce Nombre de Jesús', TRUE),
    (11104, 111, 'Patalillo', TRUE),
    (11105, 111, 'Cascajal', TRUE),

    -- Cantón 112: Acosta
    (11201, 112, 'San Ignacio', TRUE),
    (11202, 112, 'Guaitil', TRUE),
    (11203, 112, 'Palmichal', TRUE),
    (11204, 112, 'Cangrejal', TRUE),
    (11205, 112, 'Sabanillas', TRUE),

    -- Cantón 113: Tibás
    (11301, 113, 'San Juan', TRUE),
    (11302, 113, 'Cinco Esquinas', TRUE),
    (11303, 113, 'Anselmo Llorente', TRUE),
    (11304, 113, 'León XIII', TRUE),
    (11305, 113, 'Colima', TRUE),

    -- Cantón 114: Moravia
    (11401, 114, 'San Vicente', TRUE),
    (11402, 114, 'San Jerónimo', TRUE),
    (11403, 114, 'La Trinidad', TRUE),

    -- Cantón 115: Montes de Oca
    (11501, 115, 'San Pedro', TRUE),
    (11502, 115, 'Sabanilla', TRUE),
    (11503, 115, 'Mercedes', TRUE),
    (11504, 115, 'San Rafael', TRUE),

    -- Cantón 116: Turrubares
    (11601, 116, 'San Pablo', TRUE),
    (11602, 116, 'San Pedro', TRUE),
    (11603, 116, 'San Juan de Mata', TRUE),
    (11604, 116, 'San Luis', TRUE),
    (11605, 116, 'Carara', TRUE),

    -- Cantón 117: Dota
    (11701, 117, 'Santa María', TRUE),
    (11702, 117, 'Jardín', TRUE),
    (11703, 117, 'Copey', TRUE),

    -- Cantón 118: Curridabat
    (11801, 118, 'Curridabat', TRUE),
    (11802, 118, 'Granadilla', TRUE),
    (11803, 118, 'Sánchez', TRUE),
    (11804, 118, 'Tirrases', TRUE),

    -- Cantón 119: Pérez Zeledón
    (11901, 119, 'San Isidro de El General', TRUE),
    (11902, 119, 'El General', TRUE),
    (11903, 119, 'Daniel Flores', TRUE),
    (11904, 119, 'Rivas', TRUE),
    (11905, 119, 'San Pedro', TRUE),
    (11906, 119, 'Platanares', TRUE),
    (11907, 119, 'Pejibaye', TRUE),
    (11908, 119, 'Cajón', TRUE),
    (11909, 119, 'Barú', TRUE),
    (11910, 119, 'Río Nuevo', TRUE),
    (11911, 119, 'Paramo', TRUE),
    (11912, 119, 'La Amistad', TRUE),

    -- Cantón 120: León Cortés Castro
    (12001, 120, 'San Pablo', TRUE),
    (12002, 120, 'San Andrés', TRUE),
    (12003, 120, 'Llano Bonito', TRUE),
    (12004, 120, 'San Isidro', TRUE),
    (12005, 120, 'Santa Cruz', TRUE),
    (12006, 120, 'San Antonio', TRUE);

 commit;
   

   INSERT INTO minimarket.distritos (id, canton_id, nombre, is_active)
VALUES
    -- Cantón 201: Alajuela
    (20101, 201, 'Alajuela', TRUE),
    (20102, 201, 'San José', TRUE),
    (20103, 201, 'Carrizal', TRUE),
    (20104, 201, 'San Antonio', TRUE),
    (20105, 201, 'Guácima', TRUE),
    (20106, 201, 'San Isidro', TRUE),
    (20107, 201, 'Sabanilla', TRUE),
    (20108, 201, 'San Rafael', TRUE),
    (20109, 201, 'Río Segundo', TRUE),
    (20110, 201, 'Desamparados', TRUE),
    (20111, 201, 'Turrucares', TRUE),
    (20112, 201, 'Tambor', TRUE),
    (20113, 201, 'Garita', TRUE),
    (20114, 201, 'Sarapiquí', TRUE),

    -- Cantón 202: San Ramón
    (20201, 202, 'San Ramón', TRUE),
    (20202, 202, 'Santiago', TRUE),
    (20203, 202, 'San Juan', TRUE),
    (20204, 202, 'Piedades Norte', TRUE),
    (20205, 202, 'Piedades Sur', TRUE),
    (20206, 202, 'San Rafael', TRUE),
    (20207, 202, 'San Isidro', TRUE),
    (20208, 202, 'Ángeles', TRUE),
    (20209, 202, 'Alfaro', TRUE),
    (20210, 202, 'Volio', TRUE),
    (20211, 202, 'Concepción', TRUE),
    (20212, 202, 'Zapotal', TRUE),
    (20213, 202, 'Peñas Blancas', TRUE),
    (20214, 202, 'San Lorenzo', TRUE),

    -- Cantón 203: Grecia
    (20301, 203, 'Grecia', TRUE),
    (20302, 203, 'San Isidro', TRUE),
    (20303, 203, 'San José', TRUE),
    (20304, 203, 'San Roque', TRUE),
    (20305, 203, 'Tacares', TRUE),
    (20307, 203, 'Puente de Piedra', TRUE),
    (20308, 203, 'Bolivar', TRUE),

    -- Cantón 204: San Mateo
    (20401, 204, 'San Mateo', TRUE),
    (20402, 204, 'Desmonte', TRUE),
    (20403, 204, 'Jesús María', TRUE),
    (20404, 204, 'Labrador', TRUE),

    -- Cantón 205: Atenas
    (20501, 205, 'Atenas', TRUE),
    (20502, 205, 'Jesús', TRUE),
    (20503, 205, 'Mercedes', TRUE),
    (20504, 205, 'San Isidro', TRUE),
    (20505, 205, 'Concepción', TRUE),
    (20506, 205, 'San José', TRUE),
    (20507, 205, 'Santa Eulalia', TRUE),
    (20508, 205, 'Escobal', TRUE),

    -- Cantón 206: Naranjo
    (20601, 206, 'Naranjo', TRUE),
    (20602, 206, 'San Miguel', TRUE),
    (20603, 206, 'San José', TRUE),
    (20604, 206, 'Cirrí Sur', TRUE),
    (20605, 206, 'San Jerónimo', TRUE),
    (20606, 206, 'San Juan', TRUE),
    (20607, 206, 'El Rosario', TRUE),
    (20608, 206, 'Palmitos', TRUE),

    -- Cantón 207: Palmares
    (20701, 207, 'Palmares', TRUE),
    (20702, 207, 'Zaragoza', TRUE),
    (20703, 207, 'Buenos Aires', TRUE),
    (20704, 207, 'Santiago', TRUE),
    (20705, 207, 'Candelaria', TRUE),
    (20706, 207, 'Esquipulas', TRUE),
    (20707, 207, 'La Granja', TRUE),

    -- Cantón 208: Poás
    (20801, 208, 'San Pedro', TRUE),
    (20802, 208, 'San Juan', TRUE),
    (20803, 208, 'San Rafael', TRUE),
    (20804, 208, 'Carrillos', TRUE),
    (20805, 208, 'Sabana Redonda', TRUE),

    -- Cantón 209: Orotina
    (20901, 209, 'Orotina', TRUE),
    (20902, 209, 'El Mastate', TRUE),
    (20903, 209, 'Hacienda Vieja', TRUE),
    (20904, 209, 'Coyolar', TRUE),
    (20905, 209, 'La Ceiba', TRUE),

    -- Cantón 210: San Carlos
    (21001, 210, 'Quesada', TRUE),
    (21002, 210, 'Florencia', TRUE),
    (21003, 210, 'Buenavista', TRUE),
    (21004, 210, 'Aguas Zarcas', TRUE),
    (21005, 210, 'Venecia', TRUE),
    (21006, 210, 'Pital', TRUE),
    (21007, 210, 'La Fortuna', TRUE),
    (21008, 210, 'La Tigra', TRUE),
    (21009, 210, 'La Palmera', TRUE),
    (21010, 210, 'Venado', TRUE),
    (21011, 210, 'Cutris', TRUE),
    (21012, 210, 'Monterrey', TRUE),
    (21013, 210, 'Pocosol', TRUE),

    -- Cantón 211: Zarcero
    (21101, 211, 'Zarcero', TRUE),
    (21102, 211, 'Laguna', TRUE),
    (21103, 211, 'Tapesco', TRUE),
    (21104, 211, 'Guadalupe', TRUE),
    (21105, 211, 'Palmira', TRUE),
    (21106, 211, 'Zapote', TRUE),
    (21107, 211, 'Brisas', TRUE),

    -- Cantón 212: Sarchí
    (21201, 212, 'Sarchí Norte', TRUE),
    (21202, 212, 'Sarchí Sur', TRUE),
    (21203, 212, 'Toro Amarillo', TRUE),
    (21204, 212, 'San Pedro', TRUE),
    (21205, 212, 'Rodríguez', TRUE),

    -- Cantón 213: Upala
    (21301, 213, 'Upala', TRUE),
    (21302, 213, 'Aguas Claras', TRUE),
    (21303, 213, 'San José O Pizote', TRUE),
    (21304, 213, 'Bijagua', TRUE),
    (21305, 213, 'Delicias', TRUE),
    (21306, 213, 'Dos Ríos', TRUE),
    (21307, 213, 'Yolillal', TRUE),
    (21308, 213, 'Canalete', TRUE),

    -- Cantón 214: Los Chiles
    (21401, 214, 'Los Chiles', TRUE),
    (21402, 214, 'Caño Negro', TRUE),
    (21403, 214, 'El Amparo', TRUE),
    (21404, 214, 'San Jorge', TRUE),

    -- Cantón 215: Guatuso
    (21501, 215, 'San Rafael', TRUE),
    (21502, 215, 'Buenavista', TRUE),
    (21503, 215, 'Cote', TRUE),
    (21504, 215, 'Katira', TRUE),

    -- Cantón 216: Río Cuarto
    (21601, 216, 'Río Cuarto', TRUE),
    (21602, 216, 'Santa Rita', TRUE),
    (21603, 216, 'Santa Isabel', TRUE);

    commit;

    INSERT INTO minimarket.distritos (id, canton_id, nombre, is_active)
VALUES
    -- Cantón 301: Cartago
    (30101, 301, 'Oriental', TRUE),
    (30102, 301, 'Occidental', TRUE),
    (30103, 301, 'Carmen', TRUE),
    (30104, 301, 'San Nicolás', TRUE),
    (30105, 301, 'Aguacaliente o San Francisco', TRUE),
    (30106, 301, 'Guadalupe o Arenilla', TRUE),
    (30107, 301, 'Corralillo', TRUE),
    (30108, 301, 'Tierra Blanca', TRUE),
    (30109, 301, 'Dulce Nombre', TRUE),
    (30110, 301, 'Llano Grande', TRUE),
    (30111, 301, 'Quebradilla', TRUE),

    -- Cantón 302: Paraíso
    (30201, 302, 'Paraíso', TRUE),
    (30202, 302, 'Santiago', TRUE),
    (30203, 302, 'Orosi', TRUE),
    (30204, 302, 'Cachí', TRUE),
    (30205, 302, 'Llanos de Santa Lucía', TRUE),
    (30206, 302, 'Birrisito', TRUE),

    -- Cantón 303: La Unión
    (30301, 303, 'Tres Ríos', TRUE),
    (30302, 303, 'San Diego', TRUE),
    (30303, 303, 'San Juan', TRUE),
    (30304, 303, 'San Rafael', TRUE),
    (30305, 303, 'Concepción', TRUE),
    (30306, 303, 'Dulce Nombre', TRUE),
    (30307, 303, 'San Ramón', TRUE),
    (30308, 303, 'Río Azul', TRUE),

    -- Cantón 304: Jiménez
    (30401, 304, 'Juan Viñas', TRUE),
    (30402, 304, 'Tucurrique', TRUE),
    (30403, 304, 'Pejibaye', TRUE),

    -- Cantón 305: Turrialba
    (30501, 305, 'Turrialba', TRUE),
    (30502, 305, 'La Suiza', TRUE),
    (30503, 305, 'Peralta', TRUE),
    (30504, 305, 'Santa Cruz', TRUE),
    (30505, 305, 'Santa Teresita', TRUE),
    (30506, 305, 'Pavones', TRUE),
    (30507, 305, 'Tuis', TRUE),
    (30508, 305, 'Tayutic', TRUE),
    (30509, 305, 'Santa Rosa', TRUE),
    (30510, 305, 'Tres Equis', TRUE),
    (30511, 305, 'La Isabel', TRUE),
    (30512, 305, 'Chirripó', TRUE),

    -- Cantón 306: Alvarado
    (30601, 306, 'Pacayas', TRUE),
    (30602, 306, 'Cervantes', TRUE),
    (30603, 306, 'Capellades', TRUE),

    -- Cantón 307: Oreamuno
    (30701, 307, 'San Rafael', TRUE),
    (30702, 307, 'Cot', TRUE),
    (30703, 307, 'Potrero Cerrado', TRUE),
    (30704, 307, 'Cipreses', TRUE),
    (30705, 307, 'Santa Rosa', TRUE),

    -- Cantón 308: El Guarco
    (30801, 308, 'El Tejar', TRUE),
    (30802, 308, 'San Isidro', TRUE),
    (30803, 308, 'Tobosi', TRUE),
    (30804, 308, 'Patio de Agua', TRUE);

    commit;



    INSERT INTO minimarket.distritos (id, canton_id, nombre, is_active)
VALUES
    -- Cantón 401: Heredia
    (40101, 401, 'Heredia', TRUE),
    (40102, 401, 'Mercedes', TRUE),
    (40103, 401, 'San Francisco', TRUE),
    (40104, 401, 'Ulloa', TRUE),
    (40105, 401, 'Varablanca', TRUE),

    -- Cantón 402: Barva
    (40201, 402, 'Barva', TRUE),
    (40202, 402, 'San Pedro', TRUE),
    (40203, 402, 'San Pablo', TRUE),
    (40204, 402, 'San Roque', TRUE),
    (40205, 402, 'Santa Lucía', TRUE),
    (40206, 402, 'San José de la Montaña', TRUE),

    -- Cantón 403: Santo Domingo
    (40301, 403, 'Santo Domingo', TRUE),
    (40302, 403, 'San Vicente', TRUE),
    (40303, 403, 'San Miguel', TRUE),
    (40304, 403, 'Paracito', TRUE),
    (40305, 403, 'Santo Tomás', TRUE),
    (40306, 403, 'Santa Rosa', TRUE),
    (40307, 403, 'Tures', TRUE),
    (40308, 403, 'Pará', TRUE),

    -- Cantón 404: Santa Bárbara
    (40401, 404, 'Santa Bárbara', TRUE),
    (40402, 404, 'San Pedro', TRUE),
    (40403, 404, 'San Juan', TRUE),
    (40404, 404, 'Jesús', TRUE),
    (40405, 404, 'Santo Domingo', TRUE),
    (40406, 404, 'Purabá', TRUE),

    -- Cantón 405: San Rafael
    (40501, 405, 'San Rafael', TRUE),
    (40502, 405, 'San Josecito', TRUE),
    (40503, 405, 'Santiago', TRUE),
    (40504, 405, 'Ángeles', TRUE),
    (40505, 405, 'Concepción', TRUE),

    -- Cantón 406: San Isidro
    (40601, 406, 'San Isidro', TRUE),
    (40602, 406, 'San José', TRUE),
    (40603, 406, 'Concepción', TRUE),
    (40604, 406, 'San Francisco', TRUE),

    -- Cantón 407: Belén
    (40701, 407, 'San Antonio', TRUE),
    (40702, 407, 'La Ribera', TRUE),
    (40703, 407, 'La Asunción', TRUE),

    -- Cantón 408: Flores
    (40801, 408, 'San Joaquín', TRUE),
    (40802, 408, 'Barrantes', TRUE),
    (40803, 408, 'Llorente', TRUE),

    -- Cantón 409: San Pablo
    (40901, 409, 'San Pablo', TRUE),
    (40902, 409, 'Rincón de Sabanilla', TRUE),

    -- Cantón 410: Sarapiquí
    (41001, 410, 'Puerto Viejo', TRUE),
    (41002, 410, 'La Virgen', TRUE),
    (41003, 410, 'Las Horquetas', TRUE),
    (41004, 410, 'Llanuras del Gaspar', TRUE),
    (41005, 410, 'Cureña', TRUE);

    commit;


    INSERT INTO minimarket.distritos (id, canton_id, nombre, is_active)
VALUES
    -- Cantón 501: Liberia
    (50101, 501, 'Liberia', TRUE),
    (50102, 501, 'Cañas Dulces', TRUE),
    (50103, 501, 'Mayorga', TRUE),
    (50104, 501, 'Nacascolo', TRUE),
    (50105, 501, 'Curubandé', TRUE),

    -- Cantón 502: Nicoya
    (50201, 502, 'Nicoya', TRUE),
    (50202, 502, 'Mansión', TRUE),
    (50203, 502, 'San Antonio', TRUE),
    (50204, 502, 'Quebrada Honda', TRUE),
    (50205, 502, 'Sámara', TRUE),
    (50206, 502, 'Nosara', TRUE),
    (50207, 502, 'Belén de Nosarita', TRUE),

    -- Cantón 503: Santa Cruz
    (50301, 503, 'Santa Cruz', TRUE),
    (50302, 503, 'Bolsón', TRUE),
    (50303, 503, 'Veintisiete de Abril', TRUE),
    (50304, 503, 'Tempate', TRUE),
    (50305, 503, 'Cartagena', TRUE),
    (50306, 503, 'Cuajiniquil', TRUE),
    (50307, 503, 'Diriá', TRUE),
    (50308, 503, 'Cabo Velas', TRUE),
    (50309, 503, 'Tamarindo', TRUE),

    -- Cantón 504: Bagaces
    (50401, 504, 'Bagaces', TRUE),
    (50402, 504, 'La Fortuna', TRUE),
    (50403, 504, 'Mogote', TRUE),
    (50404, 504, 'Río Naranjo', TRUE),

    -- Cantón 505: Carrillo
    (50501, 505, 'Filadelfia', TRUE),
    (50502, 505, 'Palmira', TRUE),
    (50503, 505, 'Sardinal', TRUE),
    (50504, 505, 'Belén', TRUE),

    -- Cantón 506: Cañas
    (50601, 506, 'Cañas', TRUE),
    (50602, 506, 'Palmira', TRUE),
    (50603, 506, 'San Miguel', TRUE),
    (50604, 506, 'Bebedero', TRUE),
    (50605, 506, 'Porozal', TRUE),

    -- Cantón 507: Abangares
    (50701, 507, 'Las Juntas', TRUE),
    (50702, 507, 'Sierra', TRUE),
    (50703, 507, 'San Juan', TRUE),
    (50704, 507, 'Colorado', TRUE),

    -- Cantón 508: Tilarán
    (50801, 508, 'Tilarán', TRUE),
    (50802, 508, 'Quebrada Grande', TRUE),
    (50803, 508, 'Tronadora', TRUE),
    (50804, 508, 'Santa Rosa', TRUE),
    (50805, 508, 'Líbano', TRUE),
    (50806, 508, 'Tierras Morenas', TRUE),
    (50807, 508, 'Arenal', TRUE),
    (50808, 508, 'Cabeceras', TRUE),

    -- Cantón 509: Nandayure
    (50901, 509, 'Carmona', TRUE),
    (50902, 509, 'Santa Rita', TRUE),
    (50903, 509, 'Zapotal', TRUE),
    (50904, 509, 'San Pablo', TRUE),
    (50905, 509, 'Porvenir', TRUE),
    (50906, 509, 'Bejuco', TRUE),

    -- Cantón 510: La Cruz
    (51001, 510, 'La Cruz', TRUE),
    (51002, 510, 'Santa Cecilia', TRUE),
    (51003, 510, 'La Garita', TRUE),
    (51004, 510, 'Santa Elena', TRUE),

    -- Cantón 511: Hojancha
    (51101, 511, 'Hojancha', TRUE),
    (51102, 511, 'Monte Romo', TRUE),
    (51103, 511, 'Puerto Carrillo', TRUE),
    (51104, 511, 'Huacas', TRUE),
    (51105, 511, 'Matambú', TRUE);

    commit;


    INSERT INTO minimarket.distritos (id, canton_id, nombre, is_active)
VALUES
    -- Cantón 601: Puntarenas
    (60101, 601, 'Puntarenas', TRUE),
    (60102, 601, 'Pitahaya', TRUE),
    (60103, 601, 'Chomes', TRUE),
    (60104, 601, 'Lepanto', TRUE),
    (60105, 601, 'Paquera', TRUE),
    (60106, 601, 'Manzanillo', TRUE),
    (60107, 601, 'Guacimal', TRUE),
    (60108, 601, 'Barranca', TRUE),
    (60110, 601, 'Isla del Coco', TRUE),
    (60111, 601, 'Cóbano', TRUE),
    (60112, 601, 'Chacarita', TRUE),
    (60113, 601, 'Chira', TRUE),
    (60114, 601, 'Acapulco', TRUE),
    (60115, 601, 'El Roble', TRUE),
    (60116, 601, 'Arancibia', TRUE),

    -- Cantón 602: Esparza
    (60201, 602, 'Espíritu Santo', TRUE),
    (60202, 602, 'San Juan Grande', TRUE),
    (60203, 602, 'Macacona', TRUE),
    (60204, 602, 'San Rafael', TRUE),
    (60205, 602, 'San Jerónimo', TRUE),
    (60206, 602, 'Caldera', TRUE),

    -- Cantón 603: Buenos Aires
    (60301, 603, 'Buenos Aires', TRUE),
    (60302, 603, 'Volcán', TRUE),
    (60303, 603, 'Potrero Grande', TRUE),
    (60304, 603, 'Boruca', TRUE),
    (60305, 603, 'Pilas', TRUE),
    (60306, 603, 'Colinas', TRUE),
    (60307, 603, 'Chánguena', TRUE),
    (60308, 603, 'Biolley', TRUE),
    (60309, 603, 'Brunka', TRUE),

    -- Cantón 604: Montes de Oro
    (60401, 604, 'Miramar', TRUE),
    (60402, 604, 'La Unión', TRUE),
    (60403, 604, 'San Isidro', TRUE),

    -- Cantón 605: Osa
    (60501, 605, 'Puerto Cortés', TRUE),
    (60502, 605, 'Palmar', TRUE),
    (60503, 605, 'Sierpe', TRUE),
    (60504, 605, 'Bahía Ballena', TRUE),
    (60505, 605, 'Piedras Blancas', TRUE),
    (60506, 605, 'Bahía Drake', TRUE),

    -- Cantón 606: Quepos
    (60601, 606, 'Quepos', TRUE),
    (60602, 606, 'Savegre', TRUE),
    (60603, 606, 'Naranjito', TRUE),

    -- Cantón 607: Golfito
    (60701, 607, 'Golfito', TRUE),
    (60702, 607, 'Puerto Jiménez', TRUE),
    (60703, 607, 'Guaycará', TRUE),
    (60704, 607, 'Pavón', TRUE),

    -- Cantón 608: Coto Brus
    (60801, 608, 'San Vito', TRUE),
    (60802, 608, 'Sabalito', TRUE),
    (60803, 608, 'Aguabuena', TRUE),
    (60804, 608, 'Limoncito', TRUE),
    (60805, 608, 'Pittier', TRUE),
    (60806, 608, 'Gutiérrez Braun', TRUE),

    -- Cantón 609: Parrita
    (60901, 609, 'Parrita', TRUE),

    -- Cantón 610: Corredores
    (61001, 610, 'Corredor', TRUE),
    (61002, 610, 'La Cuesta', TRUE),
    (61003, 610, 'Canoas', TRUE),
    (61004, 610, 'Laurel', TRUE),

    -- Cantón 611: Garabito
    (61101, 611, 'Jacó', TRUE),
    (61102, 611, 'Tárcoles', TRUE),
    (61103, 611, 'Lagunillas', TRUE),

    -- Cantón 612: Monteverde
    (61201, 612, 'Monteverde', TRUE);

    commit;


    INSERT INTO minimarket.distritos (id, canton_id, nombre, is_active)
VALUES
    -- Cantón 701: Limón
    (70101, 701, 'Limón', TRUE),
    (70102, 701, 'Valle La Estrella', TRUE),
    (70103, 701, 'Río Blanco', TRUE),
    (70104, 701, 'Matama', TRUE),

    -- Cantón 702: Pococí
    (70201, 702, 'Guápiles', TRUE),
    (70202, 702, 'Jiménez', TRUE),
    (70203, 702, 'Rita', TRUE),
    (70204, 702, 'Roxana', TRUE),
    (70205, 702, 'Cariari', TRUE),
    (70206, 702, 'Colorado', TRUE),
    (70207, 702, 'La Colonia', TRUE),

    -- Cantón 703: Siquirres
    (70301, 703, 'Siquirres', TRUE),
    (70302, 703, 'Pacuarito', TRUE),
    (70303, 703, 'Florida', TRUE),
    (70304, 703, 'Germania', TRUE),
    (70305, 703, 'El Cairo', TRUE),
    (70306, 703, 'Alegría', TRUE),
    (70307, 703, 'Reventazón', TRUE),

    -- Cantón 704: Talamanca
    (70401, 704, 'Bratsi', TRUE),
    (70402, 704, 'Sixaola', TRUE),
    (70403, 704, 'Cahuita', TRUE),
    (70404, 704, 'Telire', TRUE),

    -- Cantón 705: Matina
    (70501, 705, 'Matina', TRUE),
    (70502, 705, 'Batán', TRUE),
    (70503, 705, 'Carrandí', TRUE),

    -- Cantón 706: Guácimo
    (70601, 706, 'Guácimo', TRUE),
    (70602, 706, 'Mercedes', TRUE),
    (70603, 706, 'Pocora', TRUE);

    commit;