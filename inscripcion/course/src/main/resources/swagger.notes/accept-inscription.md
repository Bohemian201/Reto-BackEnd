### Acerca de la funcionalidad expuesta
El servico confirma la inscripcion al curso.

### URI de acceso a la API
| M&eacute;todo |   URI       |
|--------|--------------------|
|POST    | /inscription-management/v1/accept-registration|


#### El cuerpo del Request
```json
{
    "docValue":"7521452"
}
```

### Variantes v&aacute;lidas del Response
#### Respuesta satisfactoria
Se devolver&aacute; una respuesta de la clase RegistrationResponse
```json
{
    "code": "0",
    "description": "Registrado correctamente."
}
```

### C&oacute;digos de error usados en esta versi&oacute;n de la API
|  HTTP Status | Descripci&oacute;n |
|--------------|--------------------|
| 400 | Los datos proporcionados no son v&aacute;lidos (BAD REQUEST)|

