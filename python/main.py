#################################################################################################################################
#  ___       _______              ___  ___  ___  ________  _________  _______           ________  ________  ___     ___    ___  #
# |\  \     |\  ___ \            |\  \|\  \|\  \|\   ____\|\___   ___\\  ___ \         |\   __  \|\   __  \|\  \   |\  \  /  /| #
# \ \  \    \ \   __/|           \ \  \ \  \\\  \ \  \___|\|___ \  \_\ \   __/|        \ \  \|\  \ \  \|\  \ \  \  \ \  \/  / / #
#  \ \  \    \ \  \_|/__       __ \ \  \ \  \\\  \ \_____  \   \ \  \ \ \  \_|/__       \ \   ____\ \   _  _\ \  \  \ \    / /  #
#   \ \  \____\ \  \_|\ \     |\  \\_\  \ \  \\\  \|____|\  \   \ \  \ \ \  \_|\ \       \ \  \___|\ \  \\  \\ \  \  /     \/   #
#    \ \_______\ \_______\    \ \________\ \_______\____\_\  \   \ \__\ \ \_______\       \ \__\    \ \__\\ _\\ \__\/  /\   \   #
#     \|_______|\|_______|     \|________|\|_______|\_________\   \|__|  \|_______|        \|__|     \|__|\|__|\|__/__/ /\ __\  #
#                                                  \|_________|                                                    |__|/ \|__|  #
#################################################################################################################################

# Author : A.L Mitroi

# Import random for create a random int with the name "juste_prix"
from random import randint

print("Welcome, Into Le Juste Prix ! (French Name of The Game)")

# Define the range of the number to write
range1, range2 = 0,15

juste_prix = randint(range1,range2)

# Game Loop
while True:

    # Input of the number of user
    number_of_user = int(input(f'Enter The Number you think is correct between {range1}, {range2} : '))

    # Verify if the number of the user is in the range
    if number_of_user > range2:
        print("ERROR : Number Out of Range")

    if number_of_user < range2:

        # If number is too small
        if juste_prix > number_of_user:
            print("Number Too Small")

        # If number is too large
        if juste_prix < number_of_user:
            print("Number Too Large")

        # If number is good
        if juste_prix == number_of_user:
            print("Well done you found it! the number to guess was : ", juste_prix)
