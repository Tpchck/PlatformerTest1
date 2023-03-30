package utilz;

public class Constants {
		
	public static class Directions{
			public static final int LEFT = 0;
			public static final int UP = 1;
			public static final int RIGHT = 2;
			public static final int DOWN = 3;
		}
	public static class PlayerConstants{
		public static final int IDLE = 0;
		public static final int ROLL = 1;
		public static final int RUNNING = 2;
		public static final int ATTACK_1 = 3;
		public static final int ATTACK_2 = 4;
		public static final int DEATH = 5;
		public static final int FALLING = 6;
		public static final int JUMPING = 7;
		public static final int HIT = 8;
		
		public static int GetSpriteAmount(int player_action) {
			switch(player_action) {
			
			case IDLE:
			case RUNNING:
			case ROLL:
			case DEATH:
				return 10;
			case HIT:
			case ATTACK_1:
				return 4;
			case ATTACK_2:
				return 6;
			case FALLING:
			case JUMPING:
				return 3;
			default:
				return 1;
			}
		}
	}
}
