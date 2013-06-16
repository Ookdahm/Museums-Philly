 package com.androidsfuture.museumsphilly;

import java.util.ArrayList;
import java.util.List;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.maps.GeoPoint;
import com.google.android.maps.ItemizedOverlay;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapController;
import com.google.android.maps.MapView;
import com.google.android.maps.MyLocationOverlay;
import com.google.android.maps.Overlay;
import com.google.android.maps.OverlayItem;

public class MapsHistory<PointLocation> extends MapActivity {
    /** Called when the activity is first created. */
	List<Overlay> mapOverlays;
	Drawable drawable;
	MuseumItemizedOverlay itemizedOverlay;
	Context mContext;
	MapView mapView;
	MyLocationOverlay me=null;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maps);

        mapView = (MapView) findViewById(R.id.mapview);
        mapView.setBuiltInZoomControls(true);
        
        mapOverlays = mapView.getOverlays();
        drawable = this.getResources().getDrawable(R.drawable.museum_48);
        itemizedOverlay = new MuseumItemizedOverlay(drawable);
        
        me=new MyLocationOverlay(this, mapView);
        
        me.runOnFirstFix(new Runnable() { public void run() {
            mapView.getController().animateTo(me.getMyLocation());
        }});
        
    	mapView.getOverlays().add(me);
        
    	GeoPoint point02 = new GeoPoint((int) (39.952977*1E6), (int) (-75.151634*1E6));
        OverlayItem overlayitem02 = new OverlayItem(point02, 
        		"African American History Museum in Philadelphia", "701 Arch Street, Philadelphia, PA 19106");
        
        GeoPoint point03 = new GeoPoint((int) (39.9497575*1E6), (int) (-75.1916742*1E6));
        OverlayItem overlayitem03 = new OverlayItem(point03, 
        		"Univerity of Pennsylvania Museum of Archaeology and Anthropology", "3260 South Street, Philadelphia, PA 19104");
        
        GeoPoint point05 = new GeoPoint((int) (39.9503543*1E6), (int) (-75.1521108*1E6));
        OverlayItem overlayitem05 = new OverlayItem(point05, 
        		"Atwater Kent Museum of Philadelphia", "15 South 7th Street, Philadelphia, PA 19106");
        
        GeoPoint point08 = new GeoPoint((int) (39.96163*1E6), (int) (-75.1498108*1E6));
        OverlayItem overlayitem08 = new OverlayItem(point08, 
        		"Edgar Allan Poe Historic Site", "532 N. 7th Street, Philadelphia, PA");
        
        GeoPoint point12 = new GeoPoint((int) (39.953691*1E6), (int) (-75.1396636*1E6));
        OverlayItem overlayitem12 = new OverlayItem(point12, 
        		"Independence Searport Museum", "211 South Columbus Blvd, Philadelphia, PA 19106");
        
        GeoPoint point14 = new GeoPoint((int) (39.9506833*1E6), (int) (-75.1486162*1E6));
        OverlayItem overlayitem14 = new OverlayItem(point14, 
        		"National Museum of American Jewish History", "101 South Independence Mall East, Philadelphia, PA 19106-2197");
        
        GeoPoint point15 = new GeoPoint((int) (39.9474296*1E6), (int) (-75.1747058*1E6));
        OverlayItem overlayitem15 = new OverlayItem(point15, 
        		"Rosenbach Museum and Library", "2010 Delancy Place, Philadelphia, PA 19103");
        
        GeoPoint point16 = new GeoPoint((int) (39.967314*1E6), (int) (-75.173983*1E6));
        OverlayItem overlayitem16 = new OverlayItem(point16, 
        		"Eastern State Penitentiary", "22nd & Fairmount Avenue, Philadelphia, PA 19130");
        
        GeoPoint point17 = new GeoPoint((int) (39.9480134*1E6), (int) (-75.1461357*1E6));
        OverlayItem overlayitem17 = new OverlayItem(point17, 
        		"Independence National Historical Park", "143 S. Third Street, Philadelphia, PA 19106");
        
        GeoPoint point20 = new GeoPoint((int) (39.952685*1E6), (int) (-75.142441*1E6));
        OverlayItem overlayitem20 = new OverlayItem(point20, 
        		"Elfreth's Alley", "126 Elfreth’s Alley, Philadelphia, PA 19106");
        
        GeoPoint point28 = new GeoPoint((int) (40.0529826*1E6), (int) (-74.9827232*1E6));
        OverlayItem overlayitem28 = new OverlayItem(point28, 
        		"Glen Foerd on the Delaware", "5001 Grant Avenue, Philadelphia, PA. 19114");
        
        GeoPoint point29 = new GeoPoint((int) (39.94816*1E6), (int) (-75.1701719*1E6));
        OverlayItem overlayitem29 = new OverlayItem(point29, 
        		"Lisa M. Reisman et Cie", "1714 Rittenhouse Square, Philadelphia, PA 19103");
        
        GeoPoint point30 = new GeoPoint((int) (39.980826*1E6), (int) (-75.1623917*1E6));
        OverlayItem overlayitem30 = new OverlayItem(point30, 
        		"The Wagner Free Institute of Science of Philadelphia", "1700 West Montgomery Avenue, Philadelphia, PA 19121");
        
        GeoPoint point31 = new GeoPoint((int) (39.9521121*1E6), (int) (-75.1439383*1E6));
        OverlayItem overlayitem31 = new OverlayItem(point31, 
        		"F.A.N Gallery", "221 Arch St, Philadelphia, PA 19106");
        
        GeoPoint point32 = new GeoPoint((int) (39.9514807*1E6), (int) (-75.1433141*1E6));
        OverlayItem overlayitem32 = new OverlayItem(point32, 
        		"Artists' House", "57 North Second Street,  Philadelphia, PA 19106 ");
        
        GeoPoint point33 = new GeoPoint((int) (39.9334846*1E6), (int) (-75.2155718*1E6));
        OverlayItem overlayitem33 = new OverlayItem(point33, 
        		"Bartram's Garden", "54th St. and Lindbergh Blvd., Philadelphia, PA 19143");
        
        GeoPoint point34 = new GeoPoint((int) (39.9532546*1E6), (int) (-75.1430057*1E6));
        OverlayItem overlayitem34 = new OverlayItem(point34, 
        		"Fireman's Hall Museum", "147 N. 2nd Street, Philadelphia, PA 19106");
        
        GeoPoint point35 = new GeoPoint((int) (39.8775535*1E6), (int) (-75.2135354*1E6));
        OverlayItem overlayitem35 = new OverlayItem(point35, 
        		"Fort Mifflin", "Fort Mifflin & Hog Island Roads, Philadelphia, PA 19153");
        
        GeoPoint point36 = new GeoPoint((int) (39.9553297*1E6), (int) (-75.1390972*1E6));
        OverlayItem overlayitem36 = new OverlayItem(point36, 
        		"Philadelphia Ship Preservation Guild", "301 South Columbus Blvd, Philadelphia, PA 19106");
        
        GeoPoint point37 = new GeoPoint((int) (40.0821223*1E6), (int) (-75.2198333*1E6));
        OverlayItem overlayitem37 = new OverlayItem(point37, 
        		"Woodmere Art Museum", "9201 Germantown Avenue, Philadelphia, PA 19118");
        
        GeoPoint point38 = new GeoPoint((int) (39.948799*1E6), (int) (-75.14745*1E6));
        OverlayItem overlayitem38 = new OverlayItem(point38, 
        		"Carpenters' Hall", "320 Chestnut Street, Philadelphia, PA 19106");
        
        GeoPoint point39 = new GeoPoint((int) (39.905622*1E6), (int) (-75.1754017*1E6));
        OverlayItem overlayitem39 = new OverlayItem(point39, 
        		"American Swedish Historical Museum", "1900 Pattison Avenue, Philadelphia, PA 19145");
        
        GeoPoint point40 = new GeoPoint((int) (40.046608*1E6), (int) (-75.1819529*1E6));
        OverlayItem overlayitem40 = new OverlayItem(point40, 
        		"Cliveden of the National Trust", "6401 Germantown Avenue, Philadelphia, PA 19144");
        
        GeoPoint point42 = new GeoPoint((int) (40.038238*1E6), (int) (-75.183637*1E6));
        OverlayItem overlayitem42 = new OverlayItem(point42, 
        		"Ebenezer Maxwell Mansion", "200 West Tulpehocken Street, Philadelphia, PA");
        
        GeoPoint point43 = new GeoPoint((int) (40.0299461*1E6), (int) (-75.1895398*1E6));
        OverlayItem overlayitem43 = new OverlayItem(point43, 
        		"Historic RittenhouseTown", "206 Lincoln Drive, Philadelphia, PA 19144");
        
        GeoPoint point44 = new GeoPoint((int) (40.0434249*1E6), (int) (-75.1810678*1E6));
        OverlayItem overlayitem44 = new OverlayItem(point44, 
        		"The Johnson House", "6306 Germantown Avenue, Philadelphia, PA 19144");
        
        GeoPoint point45 = new GeoPoint((int) (39.972808*1E6), (int) (-75.186777*1E6));
        OverlayItem overlayitem45 = new OverlayItem(point45, 
        		"Lemon Hill Mansion", "Sedgeley & Lemon Hill Drives , East Fairmount Park, Philadelphia, PA 19130");
        
        GeoPoint point47 = new GeoPoint((int) (39.95278*1E6), (int) (-75.149188*1E6));
        OverlayItem overlayitem47 = new OverlayItem(point47, 
        		"National Constitution Center", "525 Arch Street, Philadelphia, Pennsylvania 19106");
        
        GeoPoint point48 = new GeoPoint((int) (39.947414*1E6), (int) (-75.1683691*1E6));
        OverlayItem overlayitem48 = new OverlayItem(point48, 
        		"Romainian Folk Art Museum", "1606 Spruce St., Philadelphia, PA 19103");
        
        GeoPoint point49 = new GeoPoint((int) (40.0238171*1E6), (int) (-75.1545658*1E6));
        OverlayItem overlayitem49 = new OverlayItem(point49, 
        		"Stenton", "4601 N 18th Street, Philadelphia, PA 19140");
        
        GeoPoint point50 = new GeoPoint((int) (39.9944578*1E6), (int) (-75.1918948*1E6));
        OverlayItem overlayitem50 = new OverlayItem(point50, 
        		"Strawberry Mansion House", "2450 Strawberry Mansion Drive., Philadelphia, PA  19132");
        
        GeoPoint point51 = new GeoPoint((int) (40.6903303*1E6), (int) (-73.9896472*1E6));
        OverlayItem overlayitem51 = new OverlayItem(point51, 
        		"Sweetbriar Mansion", "1 Sweetbriar Lane, Fairmount Park West, Philadelphia, PA 19131-3792");
        
        GeoPoint point52 = new GeoPoint((int) (39.9765889*1E6), (int) (-75.2007472*1E6));
        OverlayItem overlayitem52 = new OverlayItem(point52, 
        		"Woodford Mansion", "33rd & Dauphin Streets, East Fairmount Park, Philadelphia, PA 19132");
        
        GeoPoint point53 = new GeoPoint((int) (40.039806*1E6), (int) (-75.178647*1E6));
        OverlayItem overlayitem53 = new OverlayItem(point53, 
        		"Wyck Historic House", "6026 Germantown Ave., Philadelphia, PA 19144");
        
        GeoPoint point54 = new GeoPoint((int) (39.965863*1E6), (int) (-75.1834398*1E6));
        OverlayItem overlayitem54 = new OverlayItem(point54, 
        		"The Fairmount Water Works", "640 Waterworks Drive, Philadelphia Pennsylvania 19130");
        
        GeoPoint point55 = new GeoPoint((int) (39.9507413*1E6), (int) (-75.1503814*1E6));
        OverlayItem overlayitem55 = new OverlayItem(point55, 
        		"The President's House", "6th St & Market Street, Philadelphia, PA");
        
        GeoPoint point56 = new GeoPoint((int) (39.9335523*1E6), (int) (-75.147356*1E6));
        OverlayItem overlayitem56 = new OverlayItem(point56, 
        		"Mummers Museum", "1102 S. 2nd St, Philadelphia, PA 19147");
        
        
        
        itemizedOverlay.addOverlay(overlayitem02);
        itemizedOverlay.addOverlay(overlayitem03);
        itemizedOverlay.addOverlay(overlayitem05);
        itemizedOverlay.addOverlay(overlayitem08);
        itemizedOverlay.addOverlay(overlayitem12);
        itemizedOverlay.addOverlay(overlayitem14);
        itemizedOverlay.addOverlay(overlayitem15);
        itemizedOverlay.addOverlay(overlayitem16);
        itemizedOverlay.addOverlay(overlayitem17);
        itemizedOverlay.addOverlay(overlayitem20);
        itemizedOverlay.addOverlay(overlayitem28);
        itemizedOverlay.addOverlay(overlayitem29);
        itemizedOverlay.addOverlay(overlayitem30);
        itemizedOverlay.addOverlay(overlayitem31);
        itemizedOverlay.addOverlay(overlayitem32);
        itemizedOverlay.addOverlay(overlayitem34);
        itemizedOverlay.addOverlay(overlayitem35);
        itemizedOverlay.addOverlay(overlayitem36);
        itemizedOverlay.addOverlay(overlayitem37);
        itemizedOverlay.addOverlay(overlayitem38);
        itemizedOverlay.addOverlay(overlayitem39);
        itemizedOverlay.addOverlay(overlayitem40);
        itemizedOverlay.addOverlay(overlayitem42);
        itemizedOverlay.addOverlay(overlayitem43);
        itemizedOverlay.addOverlay(overlayitem44);
        itemizedOverlay.addOverlay(overlayitem45);
        itemizedOverlay.addOverlay(overlayitem47);
        itemizedOverlay.addOverlay(overlayitem48);
        itemizedOverlay.addOverlay(overlayitem49);
        itemizedOverlay.addOverlay(overlayitem50);
        itemizedOverlay.addOverlay(overlayitem51);
        itemizedOverlay.addOverlay(overlayitem53);
        itemizedOverlay.addOverlay(overlayitem54);
        itemizedOverlay.addOverlay(overlayitem55);
        itemizedOverlay.addOverlay(overlayitem56);
        
        
        mapOverlays.add(itemizedOverlay);
        
		MapController mapControl = mapView.getController();
        mapControl.setCenter(itemizedOverlay.getCenter());
        mapControl.zoomToSpan(itemizedOverlay.getLatSpanE6(), itemizedOverlay.getLonSpanE6());
    }
    
    @Override
	public void onResume() {
		super.onResume();
		me.enableMyLocation();
		me.enableCompass();
	}		

	@Override
	public void onPause() {
		super.onPause();
		me.disableMyLocation();
		me.disableCompass();
	}
    

    protected boolean isRouteDisplayed() {
        return false;
    }
	    
	    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.map_menu, menu);
        return true;
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
        
        case R.id.Sat_View:
        	mapView.setSatellite(true);
            mapView.setStreetView(true);
            return true;
            
        case R.id.Map_View:
        	mapView.setSatellite(false);
            mapView.setStreetView(false);
            return true;
        
        case R.id.Map_Menu_All:
        	
    		startActivity(new Intent(this, Maps.class));
    		Toast.makeText(this, R.string.toast_all, Toast.LENGTH_LONG).show();
    		this.finish();
    		return true;
    		
    	case R.id.Map_Menu_Free:
    		
    		startActivity(new Intent(this, MapsFree.class));
    		Toast.makeText(this, R.string.toast_free, Toast.LENGTH_LONG).show();
    		this.finish();
    		return true;
    		
    	case R.id.Map_Menu_Art:
    		
    		startActivity(new Intent(this, MapsArt.class));
    		Toast.makeText(this, R.string.toast_art, Toast.LENGTH_LONG).show();
    		this.finish();
    		return true;
    		
    	case R.id.Map_Menu_Mansion:
    		
    		startActivity(new Intent(this, MapsMansion.class));
    		Toast.makeText(this, R.string.toast_mansion, Toast.LENGTH_LONG).show();
    		this.finish();
    		return true;
    		
    	case R.id.Map_Menu_History:
    	
    		startActivity(new Intent(this, MapsHistory.class));
    		Toast.makeText(this, R.string.toast_history, Toast.LENGTH_LONG).show();
    		this.finish();
    		return true;
    		
    	case R.id.Map_Menu_Science:
    	
    		startActivity(new Intent(this, MapsScience.class));
    		Toast.makeText(this, R.string.toast_science, Toast.LENGTH_LONG).show();
    		this.finish();
    		return true;
    		
    	default:
            return super.onOptionsItemSelected(item);
        }
    }   
	    
	    
    public class MuseumItemizedOverlay extends ItemizedOverlay {

    	private ArrayList<OverlayItem> mOverlays = new ArrayList<OverlayItem>();
    	
    	public MuseumItemizedOverlay(Drawable defaultMarker) {
    		super(boundCenterBottom(defaultMarker));
    		
    		// TODO Auto-generated constructor stub
    	}
    	
    	public void addOverlay(OverlayItem overlay) {
    	    mOverlays.add(overlay);
    	    populate();
    	}

    	@Override
    	protected OverlayItem createItem(int i) {
    		// TODO Auto-generated method stub
    		return mOverlays.get(i);
    	}

    	@Override
    	public int size() {
    		// TODO Auto-generated method stub
    		return mOverlays.size();
    	}
    	
    	@Override
    	protected boolean onTap(int index) {
    	
    	
    	  final OverlayItem item = mOverlays.get(index);
    	  AlertDialog.Builder dialog = new AlertDialog.Builder(MapsHistory.this);
    	  dialog.setTitle(item.getTitle());
    	  dialog.setMessage(item.getSnippet());
    	  
    	  dialog.setNegativeButton("Navigate", new DialogInterface.OnClickListener() {
			
			public void onClick(DialogInterface dialog, int id) {
				startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("google.navigation:q=" + item.getSnippet())));
				
			}
		});
    	  
    	  dialog.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
			
			public void onClick(DialogInterface dialog, int id) {
				dialog.cancel();
				
			}
		});
    	  dialog.show();
    	 
    	  return true;
    	}

    }

}