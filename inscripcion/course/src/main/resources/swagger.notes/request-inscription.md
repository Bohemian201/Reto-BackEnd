### Acerca de la funcionalidad expuesta
El servico registra la solicitud para la inscripcion a un curso.

### URI de acceso a la API
| M&eacute;todo |   URI       |
|--------|--------------------|
|POST    | /inscription-management/v1/request-registration|


#### El cuerpo del Request
```json
{
    "firstName":"Julio",
    "fatherName":"Roman",
    "motherName":"Ramirez",
    "gender":"M",
    "docType":"1",
    "docValue":"76301356",
    "cellphone":"971619852",
    "address":"Av. Brazil",
    "email":"julio@hotmail.com",
    "course":"diseño"
}
```

### Variantes v&aacute;lidas del Response
#### Respuesta satisfactoria
Se devolver&aacute; una respuesta de la clase RegistrationResponse
```json
{
    "code": "0",
    "description": "Se registro correctamente."
}
```

### C&oacute;digos de error usados en esta versi&oacute;n de la API
|  HTTP Status | Descripci&oacute;n |
|--------------|--------------------|
| 400 | Los datos proporcionados no son v&aacute;lidos (BAD REQUEST)|

