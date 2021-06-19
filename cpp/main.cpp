//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//  ___       _______              ___  ___  ___  ________  _________  _______           ________  ________  ___     ___    ___ //
// |\  \     |\  ___ \            |\  \|\  \|\  \|\   ____\|\___   ___\\  ___ \         |\   __  \|\   __  \|\  \   |\  \  /  /|//
// \ \  \    \ \   __/|           \ \  \ \  \\\  \ \  \___|\|___ \  \_\ \   __/|        \ \  \|\  \ \  \|\  \ \  \  \ \  \/  / ///
//  \ \  \    \ \  \_|/__       __ \ \  \ \  \\\  \ \_____  \   \ \  \ \ \  \_|/__       \ \   ____\ \   _  _\ \  \  \ \    / / //
//   \ \  \____\ \  \_|\ \     |\  \\_\  \ \  \\\  \|____|\  \   \ \  \ \ \  \_|\ \       \ \  \___|\ \  \\  \\ \  \  /     \/  //
//    \ \_______\ \_______\    \ \________\ \_______\____\_\  \   \ \__\ \ \_______\       \ \__\    \ \__\\ _\\ \__\/  /\   \  //
//     \|_______|\|_______|     \|________|\|_______|\_________\   \|__|  \|_______|        \|__|     \|__|\|__|\|__/__/ /\ __\ //
//                                                  \|_________|                                                    |__|/ \|__| //
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// Author : A.L Mitroi (Base code but with big modification (French) : https://openclassrooms.com/forum/sujet/le-juste-prix-93210)

#include <iostream>
#include <ctime>

using namespace std;
 
int main(int argc, char *argv[])
{

    // Define the range of the number to write
    const long range1 = 1, range2 = 15;
    long number_of_user = 0, juste_prix = 0, gameLoop = true;
 
    srand (time(NULL));
    juste_prix = (rand() % (range2 - range1 + 1)) + range1;
 
    cout << "Welcome, Into Le Juste Prix ! (French Name of The Game)";
 
    // Game Loop
    while ( gameLoop == true )
    {
        cout << "\nEnter The Number you think is correct between 1 and 15 : ";
        // Input of the number of user
        cin >> number_of_user;

        // Verify if the number of the user is in the range
        if (number_of_user > range2)
            cout << "ERROR : Number Out of Range";
        else {
    
            // If number is too small
            if (juste_prix > number_of_user)
                cout << "Number Too Small";

            // If number is too large
            else if (juste_prix < number_of_user)
                cout << "Number Too Large";
        
            // If number is good
            else if (juste_prix == number_of_user)
                cout << "Well done you found it! the number to guess was : " << juste_prix;
        }
    }

    return 0;
}
