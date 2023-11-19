Feature: Obtener Todas las Noticias

Scenario: El usuario solicita la lista de todas las noticias
Given el servicio de noticias está disponible
When el usuario hace una solicitud para obtener todas las noticias
Then se devuelven todas las noticias existentes
And la respuesta tiene el código de estado 200