name: PurpleRTP
version: 1.0.0
main: me.purplertp.plugin.PurpleRTP
api-version: 1.21
author: PurpleRTP
description: DonutSMP-style Random Teleport plugin with purple theme

commands:
  rtp:
    description: Randomly teleport to a safe location
    usage: /rtp
    aliases: [wild, wilderness]
  rtpadmin:
    description: Admin commands for PurpleRTP
    usage: /rtpadmin <reload|cooldown <player> <seconds>|setworldborder <radius>>
    permission: purplertp.admin

permissions:
  purplertp.use:
    description: Allows use of /rtp
    default: true
  purplertp.admin:
    description: Allows admin commands
    default: op
  purplertp.bypass.cooldown:
    description: Bypass RTP cooldown
    default: op
