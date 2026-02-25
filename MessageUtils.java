# PurpleRTP Configuration
# DonutSMP-style Random Teleport Plugin

# Cooldown in seconds between uses
cooldown: 300

# Teleport range (max distance from 0,0)
max-range: 10000

# Minimum distance from spawn (0,0)
min-range: 500

# Maximum attempts to find a safe location
max-attempts: 50

# Worlds where RTP is allowed
allowed-worlds:
  - world

# Cost to use RTP (requires Vault) - set to 0 to disable
cost: 0

# Messages (supports color codes with &)
messages:
  prefix: "&5&l[&dRTP&5&l] &r"
  searching: "&dSearching for a safe location..."
  teleporting: "&5✦ &dTeleporting you to the wilderness! &5✦"
  success: "&dYou have been teleported to &5%x%&d, &5%z%&d!"
  cooldown: "&cYou must wait &4%time% &cseconds before using RTP again!"
  no-permission: "&cYou don't have permission to use this command!"
  unsafe: "&cCould not find a safe location. Please try again."
  admin-reload: "&dConfiguration reloaded!"
  cost-message: "&5$%cost% &dhas been taken from your account."
  not-enough-money: "&cYou don't have enough money! RTP costs &4$%cost%&c."
