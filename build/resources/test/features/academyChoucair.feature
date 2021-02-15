#Autor: Jose Luis Henao
@stories
 Feature: Academy Choucair
   As an user, I want to learn how to automate in screamplay at the Choucair Academy with automation course
   @scenario1
   Scenario: Search for a automation course
     Given than Rose want to learn automation at the Academy choucair
     | strUser       | strPassword      |
     | TuUsuario     | TuClave          |
     When she search for the course on the Choucair Academy platform
     | strCourse               |
     | Metodologia Bancolombia |
     Then she finds the course called
     | strCourse               |
     | Metodologia Bancolombia |



