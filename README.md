# Get started

- Get source code
  - ```
    git clone https://github.com/bulingen/tdd-mocking-ws-2-october-2019.git
    ```
- Open IntelliJ.
- Select "Open" and select the repository folder.
- Open `src/test/java/UserControllerTests.java`.
- Right-click in the class and select "Run tests".
- The code doesn't compile out-of-the-box, so you will have to complete some stuff to make it work. A working solution is located in the branch `where-we-left`.

# Specification (Swedish)

## Del 1
Driv fram logik för UserController genom att skriva test i UserControllerTests. Dvs, ni får ändra i implementation i UserController, men inte någon annanstans (tror jag :)).

1. UserController ska ha en metod getMe, som tar in en int userId och returnerar ett objekt av typen User. (Ni behöver inte skriva test för det här)
2. getMe ska kalla på UserService.getById med godtyckligt id.
3. getMe ska kalla på UserService.getById med samma id som getMe tar in.
4. getMe ska returnera den User som hittats i UserService.getById..
5. UserController ska ha en metod getUsersPokemons, som tar in en int userId och returnerar en lista med Pokemon. (Ni behöver inte skriva test för det här)
6. getUsersPokemons ska hämta User med specificerat id från UserService
7. getUsersPokemons ska hämta lista med Pokemon från PokemonService.getByUser med User som precis hämtats.

## Del 2
Driv fram logik för PokemonService genom att skriva test i PokemonServiceTests. Dvs, ni får ändra implementation i PokemonService men inte någon annanstans (tror jag :)).

1. PokemonService ska ha en metod purchasePokemonToUser som tar in en User och returnerar en Pokemon. (Ni behöver inte skriva test för det här)
2. purchasePokemonToUser ska anropa ExternalPaymentService.pay().
3. purchasePokemonToUser ska anropa Database.save(User user) med den User som skickats in.
4. När ExternalPaymentService.pay() slänger ett exception ska PokemonService också slänga ett exception.
5. Då (när ExternalPaymentService.pay() slänger exception) ska inte Database.save() anropas alls. 
