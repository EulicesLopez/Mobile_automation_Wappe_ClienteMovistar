Feature: FLUJOS APP Mi movistar Login

@Login
Scenario Outline: Login
Given   Usuario ingresa a la App Mi Movistar
When    Usuario Ingresa credenciales de usuario "<caso_prueba>"
Then    se da clic en el botón ingresar y se verifica acceso

Examples:
| caso_prueba |
| 1           |