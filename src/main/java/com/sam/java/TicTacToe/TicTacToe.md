Create a TIC TAC TOE with multiple player P1,P2,P3 ... and multiple playing signs O,X,*,# ..


#############################----Analysis----##################################
Classes
Small to big --> Lets select
-Playing_Symbol -> ENUM {0,X,*,#...}
-PlayingSymbolSelector -> Constructor injection -> for given player
-Player -> Will play ->Attribute - id,Name,Playing_Symbol,PlayingSymbolSelector,Score,wonGame:boolean-false,playerState
-Score -> Player, score, history(List<Scores>)
- PlayerState-> Extends/Implements -> WinningState, RunningState


Flow

Player<Multiple Player> will come -> select the symbol -> Start the game -> if winning condition met for a player
-> return that player as winner

![img.png](TicTacToeUML.png)