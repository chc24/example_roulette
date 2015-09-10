# example_roulette
Program to refactor that plays a game of roulette

Names:
Calvin Chueh
Jaidev Satish


Add NEw Features:
1. Bet types are subclasses of the Bet class
2. There's a class for every single type of "bet."
3. Rather than having all the bets and the code to handle them within the Game class, all that code is in the Bet subclasses. However, adding a new Bet is as simple as creating a new subclass and adding it to the array in Game.
4. We prefer the new code, as it's far more understandable and easy to change.