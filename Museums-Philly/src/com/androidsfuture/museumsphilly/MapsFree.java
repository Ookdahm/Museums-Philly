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

public class MapsFree<PointLocation> extends MapActivity {
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
       
    	GeoPoint point08 = new GeoPoint((int) (39.96163*1E6), (int) (-75.1498108*1E6));
        OverlayItem overlayitem08 = new OverlayItem(point08, 
        		"Edgar Allan Poe Historic Site", "532 N. 7th Street, Philadelphia, PA");
        
        GeoPoint point14 = new GeoPoint((int) (39.9506833*1E6), (int) (-75.1486162*1E6));
        OverlayItem overlayitem14 = new OverlayItem(point14, 
        		"National Museum of American Jewish History", "101 South Independence Mall East, Philadelphia, PA 19106-2197");
        
        GeoPoint point17 = new GeoPoint((int) (39.9480134*1E6), (int) (-75.1461357*1E6));
        OverlayItem overlayitem17 = new OverlayItem(point17, 
        		"Independence National Historical Park", "143 S. Third Street, Philadelphia, PA 19106");
        
        GeoPoint point25 = new GeoPoint((int) (39.9539987*1E6), (int) (-75.1948068*1E6));
        OverlayItem overlayitem25 = new OverlayItem(point25, 
        		"Institute of Contemporary Art", "118 S. 36th Street, Philadelphia, PA 19104");
        
        GeoPoint point33 = new GeoPoint((int) (39.9334846*1E6), (int) (-75.2155718*1E6));
        OverlayItem overlayitem33 = new OverlayItem(point33, 
        		"Bartram's Garden", "54th St. and Lindbergh Blvd., Philadelphia, PA 19143");
        
        GeoPoint point34 = new GeoPoint((int) (39.9532546*1E6), (int) (-75.1430057*1E6));
        OverlayItem overlayitem34 = new OverlayItem(point34, 
        		"Fireman's Hall Museum", "147 N. 2nd Street, Philadelphia, PA 19106");
        
        GeoPoint point37 = new GeoPoint((int) (40.0821223*1E6), (int) (-75.2198333*1E6));
        OverlayItem overlayitem37 = new OverlayItem(point37, 
        		"Woodmere Art Museum", "9201 Germantown Avenue, Philadelphia, PA 19118");
        
        GeoPoint point42 = new GeoPoint((int) (40.038238*1E6), (int) (-75.183637*1E6));
        OverlayItem overlayitem42 = new OverlayItem(point42, 
        		"Ebenezer Maxwell Mansion", "200 West Tulpehocken Street, Philadelphia, PA");
        
        GeoPoint point49 = new GeoPoint((int) (40.0238171*1E6), (int) (-75.1545658*1E6));
        OverlayItem overlayitem49 = new OverlayItem(point49, 
        		"Stenton", "4601 N 18th Street, Philadelphia, PA 19140");
        
        GeoPoint point54 = new GeoPoint((int) (39.965863*1E6), (int) (-75.1834398*1E6));
        OverlayItem overlayitem54 = new OverlayItem(point54, 
        		"The Fairmount Water Works", "640 Waterworks Drive, Philadelphia Pennsylvania 19130");
        
        GeoPoint point55 = new GeoPoint((int) (39.9507413*1E6), (int) (-75.1503814*1E6));
        OverlayItem overlayitem55 = new OverlayItem(point55, 
        		"The President's House", "6th St & Market Street, Philadelphia, PA");
        
        
        
        itemizedOverlay.addOverlay(overlayitem08);
        itemizedOverlay.addOverlay(overlayitem14);
        itemizedOverlay.addOverlay(overlayitem17);
        itemizedOverlay.addOverlay(overlayitem25);
        itemizedOverlay.addOverlay(overlayitem33);
        itemizedOverlay.addOverlay(overlayitem34);
        itemizedOverlay.addOverlay(overlayitem37);
        itemizedOverlay.addOverlay(overlayitem42);
        itemizedOverlay.addOverlay(overlayitem49);
        itemizedOverlay.addOverlay(overlayitem54);
        itemizedOverlay.addOverlay(overlayitem55);
        
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
    	  AlertDialog.Builder dialog = new AlertDialog.Builder(MapsFree.this);
    	  dialog.setTitle(item.getTitle());
    	  dialog.setMessage(item.getSnippet());
    	  
    	  dialog.setNegativeButton("Navigate", new DialogInterface.OnClickListener() {
			
			public void onClick(DialogInterface dialog, int id) {
				startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("http://maps.google.com/maps?daddr=" + item.getSnippet())));
				
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