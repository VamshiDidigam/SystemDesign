### Question: Design Tic Tac Toe

#### Design the game of tic-tac-toe game that is played between two players on a n*n grid. The game supports following features:
1. One or both the two players can be computer
2. User should be able to select a difficulty level(easy, medium, hard) while playing with a computer


#### Future scope: 
1. Add undo feature to the game
2. Rules to decide the winner can be changed

#### Parking lot
Requirement gathering(relevant to lld of the system)
    1. Questions or answers that do not impact the design and implementation
    2. Questions that impact implementation(like type of vehicle or no of spots)
    3. Questions that impact design (how many entry points or same for entry and exit, multifloor ?, payment modes)


Finally
    2. multilevel parking lot
    2. diff types of parking spots(2 wheelrs, 4 wheelers etc or small, medium and large)
    3. multiple entry and exit
    4. paid(payment modes)
    5. fee on hourly basis
    6. spot nearest to the entry gate
    7. concurrency




classes & components
association / composition
oops(abstractions, ploymorphisms, inheritences)
connect use cases of design pattern
dont over complicate




Steps
1. find the entities and actors
   PLAYER, BOARD, WINNER, GAME, STRATEGY
2. relationship between the entities
   board has a game
   game has players

#### Solution

1. Find the actors and entities
2. Schema design
3. Class level design
4. implementation

user = [manual, computer]
board
level = [easy, medium, hard]


user
    id
    name   
    
board
    id
    game_id


game
    id
    user1
    user2
    level
    metadata

User {
    type
    id
    name
}

Board {
    int[][] board;
    User player1, player2;
    boolean turn;

    Board(N) {
        board = new board[N][N];
    }

    isValidTurn()

    mark(int row, int col){
    }

    isWon() {
        
    }
}