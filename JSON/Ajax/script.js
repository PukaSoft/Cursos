let options = [
    {"codi":1,"desCorto":"I DE","desLargo":"PRIMERA DIVISION DEL EJERCITO","guarni":"PIURA"},
    {"codi":2,"desCorto":"II DE","desLargo":"SEGUNDA DIVISION DEL EJERCITO","guarni":"RIMAC"},
    {"codi":3,"desCorto":"III DE","desLargo":"TERCERA DIVISION DEL EJERCITO","guarni":"AREQUIPA"}
    ,{"codi":4,"desCorto":"IV DE","desLargo":"CUARTA DIVISION DEL EJERCITO","guarni":"PICHARI"},{"codi":5,"desCorto":"V DE","desLargo":"QUINTA DIVISION DEL EJERCITO","guarni":"IQUITOS"},{"codi":6,"desCorto":"COEDE","desLargo":"COMANDO DE EDUCACION Y DOCTRINA DEL EJERCITO","guarni":"CHORRILLOS"},{"codi":7,"desCorto":"COLOGE","desLargo":"COMANDO DE LOGISTICA DEL EJERCITO","guarni":"SAN FCO DE SAN BORJA"},{"codi":8,"desCorto":"COPERE","desLargo":"COMANDO DE PERSONAL DEL EJERCITO","guarni":"SAN FCO DE SAN BORJA"},{"codi":9,"desCorto":"COREMOVE","desLargo":"CUARTEL GENERAL DEL COREMOVE","guarni":"SAN FCO DE SAN BORJA"},{"codi":10,"desCorto":"COSALE","desLargo":"COMANDO DE SALUD DEL EJERCITO","guarni":"SAN FCO DE SAN BORJA"},{"codi":11,"desCorto":"CA CGE","desLargo":"COMANDO ADMINISTRATIVO DEL CGE","guarni":"SAN FCO DE SAN BORJA"},{"codi":12,"desCorto":"NO TIENE","desLargo":"NO TIENE","guarni":"NO TIENE"},{"codi":13,"desCorto":"SINA","desLargo":"SITEMA DE INTG NACIONAL","guarni":"LIMA"},{"codi":14,"desCorto":"AGREGADURÍA","desLargo":"AGREGADURÍA","guarni":"ot"}]

let select = $("select")
$.each(options, function(key, option){
select.append($("<option></option>").val(option["codi"]).text(option["desLargo"]) );
})