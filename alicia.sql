CREATE TABLE `facultad` (
  `facultad_id` int(11) NOT NULL AUTO_INCREMENT,
  `facultad` varchar(150) DEFAULT NULL,
  `nombre_decano` varchar(150) DEFAULT NULL,
  `documento_decano` varchar(150) DEFAULT NULL,
  `firma` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`facultad_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

CREATE TABLE `registro` (
  `id_registro` int(11) NOT NULL AUTO_INCREMENT,
  `id_facultad` int(11) DEFAULT NULL,
  `numero_contrato` varchar(10) DEFAULT NULL,
  `documento` varchar(45) DEFAULT NULL,
  `tipo_documento` varchar(100) DEFAULT NULL,
  `ciudad_documento` varchar(45) DEFAULT NULL,
  `docente` varchar(250) DEFAULT NULL,
  `categoria` varchar(150) DEFAULT NULL,
  `asignatura` varchar(250) DEFAULT NULL,
  `grupo` varchar(45) DEFAULT NULL,
  `horas_semestre` int(11) DEFAULT NULL,
  `observarciones` varchar(250) DEFAULT NULL,
  `valor_hora` int(11) DEFAULT NULL,
  `fecha_inicio` datetime DEFAULT NULL,
  `fecha_final` datetime DEFAULT NULL,
  `cuotas` float DEFAULT NULL,
  PRIMARY KEY (`id_registro`)
) ENGINE=InnoDB AUTO_INCREMENT=19474 DEFAULT CHARSET=latin1;
